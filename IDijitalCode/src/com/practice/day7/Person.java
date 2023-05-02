package com.practice.day7;

public class Person {

	private String name, gender;
	private int age;
	
	
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	public static void eAge(Person[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].getAge() >=18) {
				System.out.println(arr[i].getName());
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] arr = new Person[10];
		arr[0] = new Person("A", "Male", 21);
		arr[1] = new Person("B", "Female", 24);
		arr[2] = new Person("C", "Male", 17);
		arr[3] = new Person("D", "Female", 12);
		arr[4] = new Person("E", "Female", 21);
		arr[5] = new Person("F", "Male", 18);
		arr[6] = new Person("G", "Female", 23);
		arr[7] = new Person("H", "Male", 40);
		arr[8] = new Person("I", "Female", 30);
		arr[9] = new Person("J", "Male", 10);
		

		eAge(arr);
	}

}
