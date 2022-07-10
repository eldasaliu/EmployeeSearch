package com.neotech.lesson07;

import java.util.Scanner;

public class Homework07 {
	//Allow user to enter grade and then provide explanation:A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
	//At the end your program should print which grade was entered by a user with explanation.

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("What is your grade");
	char grade=scanner.nextLine().charAt(0);
	
	switch (grade) {
	case 'A':
	System.out.println("A- Excellent");	
	break;
	case 'B':
	System.out.println("B-Excellent");
	break;
	case 'C':
		System.out.println("C-Average");
		break;
	case 'D':
		System.out.println("D-Bad");
		break;
		
	default :
	System.out.println("Not acceptable");
	break;
	}

	}

}
