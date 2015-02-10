package com.pizzCo.orderSystem;

import java.util.Date;
//P.O.S 1.0

/****************************************************************************
 * <b>Title</b>: Order.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 4:24:09 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Represents an order placed by a customer
 */
public class Order {

	private int orderNumber;
	private Date orderTime;
	private int orderChoice;
	
	/**
	 * Constructor to initialize order object
	 * @param orderNumber
	 * @param orderTime
	 * @param pizzaChoice
	 */
	public Order(int orderNumber, Date orderTime, int orderChoice){
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderChoice = orderChoice;
	}
	
	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the orderTime
	 */
	public Date getOrderTime() {
		return orderTime;
	}
	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the orderChoice
	 */
	public int getOrderChoice() {
		return orderChoice;
	}

	/**
	 * @param orderChoice the orderChoice to set
	 */
	public void setOrderChoice(int orderChoice) {
		this.orderChoice = orderChoice;
	}

}
