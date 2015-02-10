package com.pizzaCo.pizza;
/****************************************************************************
 * <b>Title</b>: CheesePizza.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 4:05:36 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/

public class CheesePizza extends Pizza {

	/**
	 * Constructor initializes pizza with defined member variables
	 */
	public CheesePizza(){
		setName("cheese");
		setSize("large");
		setCookingTime(7);
		setPrice(5.00);
	}
	
	/**
	 * Constructor will allow for setting of member variables
	 * @param size
	 * @param cookingTime
	 * @param price
	 */
	public CheesePizza(String name, String size, double cookingTime, double price){
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
		System.out.println("Start with 1lb of dough, american cheese... ");
	}
}
