package com.neotech.Review10;

import java.util.InputMismatchException;

public class ExceptionDemo {

	public static void main(String[] args) {
	int num1=6;
	int num2=0;
	int result=0;
	try {
		

	result=num1/num2;
	}catch(ArithmeticException ex) {//if we say only exception it will be fine because is like a parent of all
		
		
	System.out.println("Something went wrong");
	
	System.out.println("Exeption: " +ex);
	System.out.println("Message : " +ex.getMessage());
	//ex.getStackTrace();
	}
	System.out.println("result: " + result);
	
}
}