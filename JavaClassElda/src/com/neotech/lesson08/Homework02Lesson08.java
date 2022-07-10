package com.neotech.lesson08;

import java.util.Scanner;

public class Homework02Lesson08 {

	public static void main(String[] args) {
	//	Write a program that asks user to enter his/her username and password until user enters them correctly.//
		
		String username= ;
		String pasword=;
		String username1;
		String pasword1;
			
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your username");
		username1 = scan.nextLine();
		
		System.out.println("Please enter your pasword");
		pasword1=scan.nextLine();
		
		if (username.equals("elda") && (pasword.equals("456"))) {
			
		    System.out.println("Hello");	
		}
		while (!username.equals(username1)|| (!pasword.equals(pasword1))){
		
		System.out.println("Error");
		}
				
		}	
		
	}


