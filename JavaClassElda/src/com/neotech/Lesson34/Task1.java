package com.neotech.Lesson34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	
//	How would handle InputMismatchException?
//			Input Mismatch Exception when user enters
//			mismatch value then programmer expected.
//
//			- create a scanner
//			- get some input from user
//			- create a situation where InputMismatchException is thrown
//			- use try and catch to handle it

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name="";
		int age;
		
		try {
		System.out.println("Enter your name:");
		name=scan.next();
		System.out.println("enter your age:");
		age=scan.nextInt();
		System.out.println(name+ " is "+age +" years old ");
		

	}
catch(InputMismatchException ime) {
System.out.println("Cought InputMismatchException");	
System.out.println(ime.getMessage());
ime.getStackTrace();

}
}
}
