package com.pizzaCo.user;
import java.util.ArrayList;

//P.O.S 1.0
import com.pizzCo.orderSystem.Order;
import com.pizzaCo.pizza.Pizza;

/****************************************************************************
 * <b>Title</b>: Customer.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 2:41:00 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Customer will order pizza to be processed by ordering system
 */
public class Customer extends Person {

	private ArrayList<Order> orders;
	private ArrayList<Pizza> orderedPizzas;
	private String pizzaChoice;
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
		this.orders = new ArrayList<Order>(10);
		this.orderedPizzas = new ArrayList<Pizza>(10);
	}

	/**
	 * @return the pizzaChoice
	 */
	public String getPizzaChoice() {
		return pizzaChoice;
	}

	/**
	 * @param pizzaChoice the pizzaChoice to set
	 */
	public void setPizzaChoice(String pizzaChoice) {
		this.pizzaChoice = pizzaChoice;
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

	/**
	 * @return the orderedPizzas
	 */
	public ArrayList<Pizza> getOrderedPizzas() {
		return orderedPizzas;
	}

	/**
	 * @param orderedPizzas the orderedPizzas to set
	 */
	public void setOrderedPizzas(ArrayList<Pizza> orderedPizzas) {
		this.orderedPizzas = orderedPizzas;
	}

}
