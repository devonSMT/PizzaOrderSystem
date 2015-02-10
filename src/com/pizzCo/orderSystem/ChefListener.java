package com.pizzCo.orderSystem;

import com.pizzaCo.pizza.Pizza;

/****************************************************************************
 * <b>Title</b>: ChefListener.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 9:09:39 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Interface ChefListener that serves as a listening class to a chef object. 
 * Acts as a custom event handler for application to let it know what to do
 * when this custom event happens
 */
public interface ChefListener {
	
	public void pizzaCooked(Pizza pizza);
}
