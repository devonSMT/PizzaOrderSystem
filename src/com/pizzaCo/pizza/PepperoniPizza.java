package com.pizzaCo.pizza;
/****************************************************************************
 * <b>Title</b>: PepperoniPizza.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 3:59:05 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/

public class PepperoniPizza extends Pizza {

	/**
	 * Constructor initializes pizza with defined member variables
	 */
	public PepperoniPizza(){
		setName("pepperoni");
		setSize("large");
		setCookingTime(10);
		setPrice(8.50);
	}
	
	/**
	 * Constructor will allow for setting of member variables
	 * @param size
	 * @param cookingTime
	 * @param price
	 */
	public PepperoniPizza(String name, String size, double cookingTime, double price){
		setName(name);
		setSize(size);
		setCookingTime(cookingTime);
		setPrice(price);
	}

	/* (non-Javadoc)
	 * @see com.pizzaCo.pizza.Pizza#howToMake()
	 */
	@Override
	void howToMake() {
		System.out.println("Start with 1lb of dough, 1lb of pepporni, american cheese... ");
	}
}
