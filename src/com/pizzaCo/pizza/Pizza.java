package com.pizzaCo.pizza;
/****************************************************************************
 * <b>Title</b>: Pizza.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 8:46:29 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/* 
 * Represents real life pizza object(Mmmm!). Will serve as base class.
 */
public abstract class Pizza {

	private String name = null;
	private double price = 0;
	private double cookingTime = 0;
	private String size = null;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the cookingTime
	 */
	public double getCookingTime() {
		return cookingTime;
	}

	/**
	 * @param cookingTime the cookingTime to set
	 */
	public void setCookingTime(double cookingTime) {
		this.cookingTime = cookingTime;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * Explains how to make pizza
	 */
	abstract void howToMake();
}
