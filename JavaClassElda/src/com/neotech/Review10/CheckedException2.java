package com.neotech.Review10;

public class CheckedException2 {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		try {//we can use with try catch or with throws
			Thread.sleep(5000);//can wait for 5 seconds and the second one will be printed
		} catch (InterruptedException e) {//5000 it means 5second
			System.out.println("Something happened during waiting");
			e.printStackTrace();
		}
		
	System.out.println("Bye");

}
}