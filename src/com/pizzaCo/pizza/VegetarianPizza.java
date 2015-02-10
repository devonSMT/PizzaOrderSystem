package com.pizzaCo.pizza;
/****************************************************************************
 * <b>Title</b>: VegetarianPizza.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 4:05:25 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/

public class VegetarianPizza extends Pizza {
	/**
	 * Constructor initializes pizza with predefined member variables
	 */
	public VegetarianPizza(){
		setName("vegetarian");
		setSize("large");
		setCookingTime(10);
		setPrice(8.00);
	}
	
	/**
	 * Constructor will allow for setting of member variables
	 * @param size
	 * @param cookingTime
	 * @param price
	 */
	public VegetarianPizza(String name, String size, double cookingTime, double price){
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
		System.out.println("Start with 1lb of dough, fresh vegatables and tomatoe sauce");
		System.out.println("Cut vegetables into quarters.. ");
	}
}
