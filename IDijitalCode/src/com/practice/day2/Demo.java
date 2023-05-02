package com.practice.day2;

class Calculator{
	
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b, int c){
		return a+b+c;
	}
	public double add(double a,double b){
		return a+b;
	}
}
public class Demo {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 5;
		Calculator clc = new Calculator();
		
		clc.add(num1, num2);
		
	}

}
