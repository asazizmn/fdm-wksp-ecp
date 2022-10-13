/**
 * Student.java
 * - basic demonstration of a class
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	12/10/22
 */

package com.fdmgroup.ood1.classes;



public class Student {
	
	// Attributes (a.k.a. data members, instance variables) ////////////////////////
	
	int id;
	String name;

	
	
	// Behaviour (a.k.a. methods) ////////////////////////
	// ... the following can, basically, be generated by eclipse
	
	// constructor - used to initialise the object
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	// getters & setters - used to get & set values in the object
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// main runner - used to create an object and run it
	public static void main(String args[]) {
		
		// instantiate the student class
		Student s1 = new Student(12, "Abdullah");
		
		// provided the class - level attributes are accessible
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		// otherwise, it's normally better practice to use the getters
		System.out.println(s1.getId());
		System.out.println(s1.getName());
	}



}