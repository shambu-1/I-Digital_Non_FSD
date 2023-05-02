package com.practice.day6;

// Java program to Illustrate
// working of toString() method

// Main class
public class ToStringDemo {

	// Member attributes of this class
	String name;
	int age;
	String college;
	String course;
	String address;

	// Constructor of this class
	ToStringDemo(String name, int age, String college, String course, String address)
	{
		// This variable refers to current instance itself
		this.name = name;
		this.age = age;
		this.college = college;
		this.course = course;
		this.address = address;
	}
	
	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of this class
		// Custom attributes been passed as in arguments
		ToStringDemo b = new ToStringDemo("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");

		// Print and display commands to illustrate
		// toString() method as both will print the same Print the object
		System.out.println(b);
		
		// Print the object but implicitly using toString() method
		System.out.println(b.toString());
	}
}
