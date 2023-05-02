package com.practice.day2;


class B extends OverloadingOverriding{
	
	@Override
	public int area(int b, int h) {
		return (b*h)/2;
		
	}
	
}


public class OverloadingOverriding {
	
	public int area(int l, int b) {
		return l*b;
	}
	
	public double area(double r) {
		return (3.14)*r*r;
	}
	
	
	public static void main(String[] args) {
		
		double radius = .5;
		
		OverloadingOverriding a = new OverloadingOverriding();
		OverloadingOverriding b = new B();
		
		System.out.println(a.area(5,4));
		System.out.println(a.area(radius));
		System.out.println(b.area(5,4));
		
		
	}

}
