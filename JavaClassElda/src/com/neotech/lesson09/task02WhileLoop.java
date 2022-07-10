package com.neotech.lesson09;

import java.util.Scanner;

public class task02WhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int num = 0;
		
		System.out.println("please enter a positive number Stop enter -1");
		num=scan.nextInt();
		while(num !=-1) {
			total = total+num;
			
			System.out.println("please enter a positive number Stop enter -1");
			num=scan.nextInt();
			
			
		}
		
		System.out.println("total -> " + total);
		
		
		

	}

}
