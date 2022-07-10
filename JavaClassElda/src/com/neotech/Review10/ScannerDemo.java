package com.neotech.Review10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int num1 = 0, num2 = 0, result = -1;

			try {
				System.out.println("Please enter a number:");
				num1 = scan.nextInt();

				System.out.println("Please enter another number:");
				num2 = scan.nextInt();

				result = num1 / num2;

			} catch (InputMismatchException ime) {
				System.out.println("Sorry, you didn't enter a correct number!");
			} catch (ArithmeticException ae) {
				System.out.println("Error when dividing!");
			} catch (Exception e) {
				System.out.println("Some other exception!");
			} finally {
				System.out.println("This will always be executed!");
				scan.close();
			}

	}

}
