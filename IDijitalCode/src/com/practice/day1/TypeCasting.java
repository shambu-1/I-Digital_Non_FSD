package com.practice.day1;

public class TypeCasting {
	
	public static void main(String[] args) {
		int a = 257;
		byte k = (byte)a; // Explicit conversion
		
//		It will divide the variable 'a' with byte 
//		range(256) and take only the reminder.
//		i.e. Modulus operation.
		System.out.println("Byte value is " + k);
		
		float f = 5.6f;
		int t = (int)f;
//		Here after converting to int the '.6' will
//		be lost.
		
		
		
		System.out.println(t);
	}

}
