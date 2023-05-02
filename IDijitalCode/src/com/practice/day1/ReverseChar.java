package com.practice.day1;

import java.util.Scanner;

public class ReverseChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = scan.nextLine();
		for(int i = s.length()-1 ; i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
