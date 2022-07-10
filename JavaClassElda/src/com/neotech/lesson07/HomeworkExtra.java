package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String city;
		
		int f;
		int c;
		System.out.println("Please enter the city and temp");
		
		city=scan.next();
		f= scan.nextInt();
		c=(f-32) * 5/9;
		System.out.println("Temp is "  + c + "in the city of "  + city);
		
	}

}
