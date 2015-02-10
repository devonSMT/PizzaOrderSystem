package com.pizzaCo.user;
/****************************************************************************
 * <b>Title</b>: Person.java <p/>
 * <b>Project</b>: PizzaOrderingSystem <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 2:32:49 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 * Class represents real life representation of a living human being
 */
public class Person {

	private String firstName;
	private String lastName;
	private String ethnicity; 
	private String religion;
	private int age;
	
	/**
	 * Constructor that will initialize all member variables with parameters
	 * @param firstName
	 * @param lastName
	 * @param ethnicity
	 * @param religion
	 * @param age
	 */
	public Person(String firstName, String lastName, String ethnicity, String religion, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.ethnicity = ethnicity;
		this.religion = religion;
		this.age = age;
	}
	/**
	 * Constructor will initialize class with parameters of first and last name
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		//set defaults for other variables
		this.ethnicity = "unknown";
		this.religion = "unknown";
		this.age = 1;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the ethnicity
	 */
	public String getEthnicity() {
		return ethnicity;
	}
	/**
	 * @param ethnicity the ethnicity to set
	 */
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}
	/**
	 * @param religion the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
