package com.neotech.lesson09;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
//		Write a program that asks user to enter his/her username and password until user enters them correctly.//
		Scanner scan=new Scanner(System.in);
		//user own credetials
		String username= "user";
		String password= "password";
		//user input
		String user;
		String pass;
		
		
		
		boolean flag=true;
		
		
		
		do { //when user enters the correct info ,we stop looping (we make flag false
			
			System.out.println("Please enter your username");
			username= scan.next();
		   
			System.out.println("please enter password");
			password=scan.next();
			
			
			
			if (username.equals(username) && password.equals(password)){
				
				
			}
			System.out.println("you are logged in");
			break;
			
			//another way
			//flag=false;
		}  while ( flag); 
			
			
			}//how do we decide?
	//for vs while vs do while
	//for is more suitable for countable number of loops
	//while vs do while
	
	  
	//next logic
	
			
	}

			
			
		

          

		
