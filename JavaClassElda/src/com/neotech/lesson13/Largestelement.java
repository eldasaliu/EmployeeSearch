package com.neotech.lesson13;

public class Largestelement {

	public static void main(String[] args) {//how to find largest number
		
		int[] numbers = { 35,45,67,14,-4,99,25,50};
//		//one way
//		int largest=0;
//		//other way
		int largest =numbers[0];
		
		for(int i=0; i<numbers.length;i++)
			
		{//check the current largest number with every number in the array
			
			if (numbers[i]> largest) {
				
			largest = numbers[i];
			}
		}
System.out.println("Our largest number is : " + largest);
		}
		
	
	}
