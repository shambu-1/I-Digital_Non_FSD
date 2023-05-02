package com.practice.day7;



interface person{
	void display();
}

class person1 implements person{
	public void display() {
		System.out.println("person1");
	}
}

class person2 implements person{
	public void display() {
		System.out.println("person2");
	}
}


public class Abstraction {

	public static void main(String [] args) {
		person a =new person1();
		a.display();
		
		person b = new person2();
		b.display();
	}
}
