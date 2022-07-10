package com.neotech.lesson16;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * // Homework 3: // Write a program that reads two parent's first names and if
		 * they expecting boy or girl? Based on the input suggests a name for a baby: If
		 * it is a boy get half from dad and half from mom. If it is a girl get half
		 * from mom and half from dad.
		 * 
		 * Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl?
		 * boy Suggested baby name: DANRY
		 * 
		 * Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Mom's first name");
		String Mom = scan.next();
		System.out.println("Dad's first name");
		String Dad = scan.next();
		System.out.println("Baby boy or Girl");
		String baby = scan.next();
		if (baby.equals("boy")) {
			System.out.println(Dad.substring(0, Dad.length() / 2) + Mom.substring(Mom.length() / 2, Mom.length()));
		} else if (baby.equals("girl")) {
			System.out.println(Mom.substring(0, Mom.length() / 2) + Dad.substring(Dad.length() / 2, Dad.length()));

		} else 
			
			System.out.println("None");

	}

}
