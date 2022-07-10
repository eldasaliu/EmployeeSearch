package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {
//	Ask the user to enter the height in inches. Person should be classified as one of the following:
//		• short (under 60 inch)
//		• medium (between 60 -72 inch)
//		• tall (over 72 inch)
	public static void main(String[] args) {
		int height; 
		Scanner scan=new Scanner(System.in);
		
System.out.println("What is yor height?");
height = scan.nextInt();

	if(height>0 && height < 60)  
		
	{
	System.out.println(" Classified as short");
	
	}
	 if (height >60 && height <72)
	{
		System.out.println("Classified as medium");	
	}
	else if ( height >72)
		
	{
		System.out.println("Clasified as tall");	
	}
	else {
		
		
		System.out.println("");
		
	}
}
	
}
