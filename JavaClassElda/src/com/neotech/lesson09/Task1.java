package com.neotech.lesson09;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner (System.in);
		
				int luckyNumber=5;
				int number;
				System.out.println("guess my number");
				number=input.nextInt();
				
				
				while(number!=luckyNumber) {
					System.out.println("Guess my number");
					number=input.nextInt();
					
				}
			System.out.println("you are the winner");
			
	}
//using do while loop (it is better way)
	do {
		System.out.println("Guess my number");
		number=input.nextInt()
				while (number !=luckyNumber);
		System.out.println("You are the winner");
		
		
		
	}
}






//Ask a user: Guess the number
	// Lucky number is 5
	// As long as the entered number is not 5 we need keep ask for trying
	// Once number is correct --> "You're winner"
​
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int luckyNumber = 5;
		int number;
​
		// Using while loop
		//		System.out.println("Guess my number!");
		//		number = input.nextInt();
		//
		//		while (number != luckyNumber) {
		//			System.out.println("Guess my number!");
		//			number = input.nextInt();
		//		}
		//
		//		System.out.println("You're winner");
​
		// In this example using do-while is BETTER
		// Using do-while loop
		do {
			System.out.println("Guess my number!");
			number = input.nextInt();
		} while (number != luckyNumber);
​
		System.out.println("You're winner");
​
	}
​
}