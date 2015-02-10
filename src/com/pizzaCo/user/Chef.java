package com.pizzaCo.user;

//JDK 7.0.X
import java.util.ArrayList;
import java.util.HashMap;

//P.O.S 1.0
import com.pizzCo.orderSystem.ChefListener;
import com.pizzCo.orderSystem.Order;
import com.pizzaCo.pizza.Pizza;

/****************************************************************************
 * <b>Title</b>: Chef.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 9:13:23 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Will cook any pizzas orders received then send out notifications through system to 
 * notify when pizzas are done cooking, then send back pizza to customer. Class 
 * will implement runnable to mirror
 * real life situation of chef cooking pizza, the system(or customer) will not have
 * to wait for pizza to finish cooking to do something else, process will run
 * then return when finished.
 */
public class Chef extends Person implements Runnable{
	
	private ChefListener listener;
	private ArrayList<Pizza> pizzaBox;
	private HashMap<Integer, Pizza> pizzaMenu;
	private ArrayList<Order> orders;
	private String title;
	
	/**
	 * Constructor that will initialize class
	 */
	public Chef(String firstName, String lastName, String title, HashMap<Integer, Pizza>pizzaMenu, ChefListener listener){
		super(firstName, lastName);
		this.title = title;
		this.pizzaMenu = pizzaMenu;
		this.listener = listener;
	}
	
	@Override
	public void run(){
		//override
	}
	
	/**
	 * Chef will cook pizza and system listener of completion
	 * @param orderList
	 */
	public ArrayList<Pizza> makePizza(ArrayList<Order> orderList){
		pizzaBox = new ArrayList<Pizza>(10);
		//loop through pizza orders
		for(int i = 0; i < orderList.size(); i++){
			//get pizza(s) based off of orders from pizza menu
			 Pizza pizza = pizzaMenu.get(orderList.get(i).getOrderChoice());
			try {
				//causes the current thead to sleep(stop executing) in milliseconds 
			    //based on the number passed. (1000 milliseconds == 1 second)
				Thread.sleep((long) pizza.getCookingTime() * 1000);
				
				//notify system
				notify(pizza);
				
				//add to finished pizza to stack
				this.pizzaBox.add(pizza);
		
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

        }
		
		return this.pizzaBox;
	}
	
	/**
	 * notify listener that pizza has been cooked
	 * @param pizza
	 */
	public void notify(Pizza pizza){
		listener.pizzaCooked(pizza);
	}
	
	/**
	 * @return the listener
	 */
	public ChefListener getListener() {
		return listener;
	}

	/**
	 * @param listener the listener to set
	 */
	public void setListener(ChefListener listener) {
		this.listener = listener;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the cookedPizzas
	 */
	public ArrayList<Pizza> getCookedPizzas() {
		return pizzaBox;
	}

	/**
	 * @return the pizzaMenu
	 */
	public HashMap<Integer, Pizza> getPizzaMenu() {
		return pizzaMenu;
	}

	/**
	 * @return the orders
	 */
	public ArrayList<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
}
