package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		package com.neotech.lesson07;
		import java.util.Scanner;
		public class RecapScanner {
			public static void main(String[] args) {
				// Class name name = new Class name
				// Import shortcut: CTRL + SHIFT + O
				Scanner scanner = new Scanner(System.in);
				String text1, text2, text3;
				int age, year;
				double salary;
				boolean isRaining;
				char gender;
				/*
				 * //be careful asking for input, you might not know that you need to write
				 * something!!! System.out.println("Enter a sentence: "); text1 =
				 * scanner.next(); //delimiter is space
				 * 
				 * System.out.println(text1);
				 * 
				 * text2 = scanner.next(); System.out.println(text2);
				 * 
				 * //difference between next() and nextLine()
				 * 
				 * text3 = scanner.nextLine(); System.out.println(text3);
				 * 
				 * 
				 * System.out.println("What is your age?"); age = scanner.nextInt();
				 * System.out.println("What year is it?"); year = scanner.nextInt();
				 * 
				 * System.out.println("Age: " + age + " year " + year);
				 * 
				 */
				// write /* then press CTRL + ENTER
				/*
				 * 
				 */
				// for commenting multiple lines: Select the code then CTRL + SHIFT + /
				/*
				 * System.out.println("What is your salary (ex: 50.25)?"); salary =
				 * scanner.nextDouble();
				 * 
				 * System.out.println("Is it raining (only true or false) ?"); isRaining =
				 * scanner.nextBoolean();
				 * 
				 * System.out.println("Salary is: " + salary);
				 * System.out.println("Today is raining: " + isRaining);
				
				
				System.out.println("Enter your gender (M or F): ");
				gender = scanner.next().charAt(0); //method chaining
				//two steps:
				//1. scan the string
				//scanner.next();
				String str = scanner.next();
				//2. get only a char out of it
				//get the needed char
				gender = str.charAt(0);
				System.out.println(gender);
		 */
				System.out.println("Enter your name, age, gender, and salary:");
				text1 = scanner.next();
				age = scanner.nextInt();
				gender = scanner.next().charAt(0);
				salary = scanner.nextDouble();
				
				
				System.out.println("Your info is: "+text1 + " " + age + " " + gender + " " + salary);
				
				
			}
		}
	

}
	
	
	
	
	

	//condition1  condition2 


	//&&....>   both must be true
	//II ...>(or ) only one is enough
	// if height = -10

