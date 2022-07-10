package com.neotech.lesson09;

import java.util.Scanner;

public class Homework02Lesson09 {

	public static void main(String[] args) {
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an "yes" from a user program should stop asking.
	   String customerA;
	    String customerB;
	     boolean customerC=true;
		Scanner scan =new Scanner(System.in);	
		
		System.out.println("Do you want a credit card?");
		
		customerA = scan.next();
		
		System.out.println("Do you want a credit card?");
		
		customerB=scan.next();
		
		System.out.println("Yes, I want credit card.");
		
		
			
		if(!customerA.equals (customerC)){
	
		break;
		}		
	
		
				while(!false) ;
}
	}

	
		/*
		}System.out.println("=========");
	 //using for loop 
		String input;
	for (int i=0;i <10; i++) 
	{
		System.out.println(" Do you want a credit card ");
         input =scan.next();
          if (input.equals("yes"))
          {
	System.out.println("perfect");
	  break;
  
          }
          
	
	}

	*/

