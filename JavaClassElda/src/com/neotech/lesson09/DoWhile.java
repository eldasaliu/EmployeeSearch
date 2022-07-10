package com.neotech.lesson09;

public class DoWhile {

	public static void main(String[] args) {

		System.out.println("Similarities between While & Do-While");
		int age=1;
		while(age <= 10) {
			
			System.out.println(" Happy birthday You are "+ age + "years old");
		age ++;
		
		}
		
		System.out.println( "+++++++");
		int age2=1;
		do {
			System.out.println("Happy birthday  You are " + age2 + "years old");
			age2++;
		}	
			while(age2 <=10);
		
		System.out.println("Differences between while and do - while");
		
		boolean hot=true;
		while(!hot) {
			System.out.println("While _> Drink");
			
			
		}
		do {
			System.out.println("Do - While -> Drink");
			
			
		}while(!hot);
		
		
		
	}

}
