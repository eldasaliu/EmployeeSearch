package com.neotech.lesson09;

import java.util.Scanner;

public class task002 { // Task & break until 12:20
	// Ask the user to enter a positive number and add it to the total
	// He should enter -1 to STOP. -1 will not be added to the total

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int i = 0;

		do {
			System.out.println("Enter positive number");

			i = scan.nextInt();
			if (i !=-1) {
				break;
			}
			total = total + i;
			
		} while (i != -1);
		System.out.println("total is " + total);

	}//if we add -1 since -1 equal to -1 we dont contiue after7

}
