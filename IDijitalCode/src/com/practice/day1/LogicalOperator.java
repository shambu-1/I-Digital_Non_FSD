package com.practice.day1;

public class LogicalOperator {
	public static void main(String [] args) {
		int x = 7;
		int y = 5;
		int a = 5;
		int b = 9;
		
//		boolean result = x>y && a>b; // false -> T + F
//		boolean result = x>y || a>b; // true -> T + F
		boolean result = x<y || a>b; // false -> F + F
		
		System.out.println(result);
	}

}
/*
 * & - AND (&&)
 * 		T	T+T
 * 		T	F+F
 * 		F	T+F
 * 		F	F+T
 * | - OR (||)
 * 		T	T+T
 * 		T	T+F
 * 		T	F+T
 * 		F	F+F
 * ! - NOT (!)
 * 		T 	F
 * 		F	T
*/