package com.neotech.lesson10;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = scan.nextInt();
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");

			}
			System.out.println();
		}

		for (int row = n; row >= 1; row--) {
			for (int col = 1; col < row; col++) {
				System.out.print(col + " ");

			}
			System.out.println();
		}
	}

}
