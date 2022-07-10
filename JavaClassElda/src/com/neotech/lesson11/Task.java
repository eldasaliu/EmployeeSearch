package com.neotech.lesson11;

public class Task {

	public static void main(String[] args) {
		// Create an array of integers and 
		//calculate the sum of all elements in the array

		int [] numbers = {5,7,9,11};
		
		
		int sum=0;
		for(int a=0;a<4;a++) {//or a <numbers.length
			sum+=numbers[a];
			
		}
			
		System.out.println("the sum is -->" +sum);
		
		//2 nd way ,enhanced for loop
		int total=0;
		for (int num: numbers) {
			total +=num;
			
		}
		System.out.println("the total is " + total);
	}

}
