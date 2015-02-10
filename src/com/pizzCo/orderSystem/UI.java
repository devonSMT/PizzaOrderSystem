package com.pizzCo.orderSystem;
//JDK 7.0.X
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

//Javax 7.0.X
import javax.swing.JOptionPane;

//SMTAppLibs
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//P.O.S 1.0
import com.pizzaCo.message.MessageQue;
import com.pizzaCo.pizza.CheesePizza;
import com.pizzaCo.pizza.PepperoniPizza;
import com.pizzaCo.pizza.Pizza;
import com.pizzaCo.pizza.VegetarianPizza;
import com.pizzaCo.user.Chef;
import com.pizzaCo.user.Customer;

/****************************************************************************
 * <b>Title</b>: UI.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 8:43:14 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Serves as the interface device that lets customer place orders into system
 * for the chef to cook.  The chef will receive their order through this UI and then send
 * message back letting customer know their pizza is finished cooking.
 */
public class UI implements ChefListener{

	private static final Logger log = Logger.getLogger(UI.class.getName());
	
	public HashMap<Integer, Pizza> pizzaMenu;
	public ArrayList<Order> orders;
	public Customer customer;
	public Chef chef;
    public MessageQue messages;
    public String propertyPath = "properties/log4j.properties";
    
	 /**
	  * Main Method
	  * @param args
	  */
	 public static void main(String[] args){
       UI myUI = new UI();
       myUI.setUpShop();
       myUI.runShop();
	 }
	 
	 /**
	  * Initializes class to be run
	  */
	 public void setUpShop(){
		 PropertyConfigurator.configure(propertyPath);
		 
		 messages = new MessageQue();
		 pizzaMenu = new HashMap<Integer, Pizza>();
		 //create menu of several pizzas for customer choice
		 Pizza cheese = new CheesePizza("Extremely Cheesey", "Medium", 1, 8.00);
		 Pizza pepperoni = new PepperoniPizza("Awesome Pepperoni", "Large", 5, 20.00);
		 Pizza vegetarian = new VegetarianPizza("Fancy Vegetarian", "Large", 4, 15.00); 
		 
		 pizzaMenu.put(1, cheese);
		 pizzaMenu.put(2, pepperoni);
		 pizzaMenu.put(3, vegetarian);
		 
		 orders = new ArrayList<Order>(10);
		 
		 //create a customer
		 customer = new Customer("Ralph", "Beanbag");
		 //create a chef
		 chef = new Chef("Alonzo", "FancyPants", "Head Cook", pizzaMenu, this);
		 //out put message that store is open
		 log.info(messages.getMessage(MessageQue.STORE_OPEN));
	 }
	 
	 /**
	  * Run method of class, creates pizzas and places them as orders for
	  * chef to cook
	  */
	 public void runShop(){
		 
		 //ask customer to choose from pizza menu
		 log.info("Hello " + customer.getFirstName() + 
				 messages.getMessage(MessageQue.PIZZA_TYPE));
		 listPizzaMenu(pizzaMenu);
		 log.info(messages.getMessage(MessageQue.MENU_NO));
		 
		 //let customer place order
		 boolean keepOrdering = true;
		 int orderNumber = 0;
			 while(keepOrdering){
				 
				 //get customer input choice
				 int menuSize = pizzaMenu.size();
				 int menuMinimum = menuSize - menuSize +1;
				 int choice = getCustomerChoice(
						 messages.getMessage(MessageQue.PIZZA_OPTION), menuMinimum, menuSize);
				 
				 //create orders from user choice
				 Date orderTime = new Date();
				 orderNumber++;
	
				 Order order = new Order(orderNumber, orderTime, choice);
				//give customer their order. Add order to order list.
				 customer.getOrders().add(order);
				 orders.add(order);
				 log.info(messages.getMessage(MessageQue.ORDER_PLACED));
				 
				//check for if they choose a option out of range of size of pizzaMenu
				 int min = 1;
				 int max = 2;
				 int orderAgain = getCustomerChoice(
						 messages.getMessage(MessageQue.PLAY_AGAIN), min, max);
				 
				if(orderAgain == 2){
					 keepOrdering = false;
				 }				 		 
			 }
			 
				//give order(s) to chef to cook
				ArrayList<Pizza> orderedPizzas =  chef.makePizza(orders);
					 
				//give pizzas to customer
				customer.setOrderedPizzas(orderedPizzas);
	 }
	 
	 /**
	  * Cycles through pizza menu for available pizzas
	  * @param pizzaMenu
	  */
	 public void listPizzaMenu(HashMap<Integer, Pizza>pizzaMenu){
		 //loop through array list of pizzas
		 for(int x = 1; x < pizzaMenu.size() + 1; x++){
			 log.info(x + ") "  + pizzaMenu.get(x).getName());
		 }
	 }
	 
	 /**
	  * Gets a customer input and returns it
	  * @return the customer choice
	  */
	 public Integer getCustomerChoice(String mssg, int min, int max){
		 int customerChoice = 0;
		 boolean invalidChoice = true;
	     
		 //keep getting response until user gives valid choice
		 while(invalidChoice){
			 
	         //get customer response through dialog box
		     String input = JOptionPane.showInputDialog(null, mssg);   
		     
			 invalidChoice = validateChoice(input, min, max);
			 
			 //validation passed, parse their input to number
			 if(!invalidChoice){
				 customerChoice =  Integer.parseInt(input);	
			 }
		 } 
		 return customerChoice;
	 }
	 
	 /**
	  * Validates a customer choice to ensure they choice a valid response
	  * @param CustomerChoice
	  */
	 public boolean validateChoice(String input, int minimum, int max){
		 boolean invalidOption = false;
		 
		 //check if value is null(they hit the cancel button)
	     if(input == null){
	    	 JOptionPane.showMessageDialog(null, messages.getMessage(MessageQue.CANCEL_ORDER));
	    	 System.exit(0);
	     }
	     //check if user typed in letter instead of a number
		try {
			int customerChoice =  Integer.parseInt(input);
			 
			 if(customerChoice > max || customerChoice < minimum){
				 JOptionPane.showMessageDialog(null, messages.getMessage(MessageQue.OPTIONS_AVAILABLE));
				 invalidOption = true;
			 }
			 
			 //user typed in something other than a number
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, messages.getMessage(MessageQue.INPUT_NUMBER));
				invalidOption = true;	
			} 

		 return invalidOption;
	 }

	/* 
	 * Let customer know that their pizza has been cooked
	 */
	@Override
	public void pizzaCooked(Pizza pizza) {	
		log.info("Your " + pizza.getName()  + " pizza has been cooked.");		
	}	
}
