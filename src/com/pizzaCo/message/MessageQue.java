package com.pizzaCo.message;
//JDK 7.0.X
import java.util.HashMap;

/****************************************************************************
 * <b>Title</b>: Message.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 5:04:10 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Class will hold any messages used for pizza application 
 */
public class MessageQue {

	private HashMap<String, String> messages;
	
	//set constants
	public final static String PIZZA_OPTION = "pizza option";
	public final static String PLAY_AGAIN = "play again";
	public final static String ORDER_PLACED = "order placed";
	public final static String STORE_OPEN = "store open";
	public final static String CANCEL_ORDER = "cancel order";
	public final static String OPTIONS_AVAILABLE = "options avaliable";
	public final static String MENU_NO = "menu no.";
	public final static String INPUT_NUMBER = "input number";
	public final static String PIZZA_TYPE = "pizza type";
	/**
	 * Constructor, sets all messages for class when initialized
	 */
	public MessageQue(){
		this.messages = new HashMap<String, String>();
		this.setAllMessages();
	}
	
	/**
	 * Returns specified message that is passed
	 * @param mssg
	 * @return
	 */
	public String getMessage(String mssg){
		return this.messages.get(mssg);
		
	}
	
	/**
	 * Sets all messages to be used
	 */
	public void setAllMessages(){
		this.messages.put(PIZZA_OPTION, "Please choose a pizza option");
		this.messages.put(PLAY_AGAIN, "Do you want to order again? 1) Yes 2) No");
		this.messages.put(ORDER_PLACED, "Order has been placed, thanks! We will let you know when it is cooked.");
		this.messages.put(STORE_OPEN, "Store is open for business!");
		this.messages.put(CANCEL_ORDER, "Canceling your order");
		this.messages.put(OPTIONS_AVAILABLE, "Please choose one of the options available");
		this.messages.put(MENU_NO, "Choose the menu number for your pizza choice.");
		this.messages.put(INPUT_NUMBER, "Input must be a number.");
		this.messages.put(PIZZA_TYPE, " what type of pizza do you want?");
		
	}
}
