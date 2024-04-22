package com.assignment;

public class SwapNumber {

	public static void main(String[] args) {
		
		/*  Write a program that declare two integer variable, swap their values without using third variable
		 * and print the result.*/
		
		int a = 10;
		int b = 15;
		
		System.out.println("Before swaping number is: "+a +" "+b);

		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("After swaping number is: "+a +" "+b);
		

		
	}

}
