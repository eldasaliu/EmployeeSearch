package com.neotech.lesson13ReviewExamples;

public class MaxIn2DArrayTask {

	public static void main(String[] args) {
		// Task: Find the biggest number in a 2D Array
        int[][] numbers = { 
                { 2, 3, 5 }, 
                { 2, 4, 7 }, 
                { 8, 1, 9 }, 
                { 3, 5, 1 } 
        };
        
        int largest =numbers[0][0];
        for(int row=0;row<numbers.length;row++) {
        	for (int col=0;col<numbers[row].length;col++) {
        		
        		if(numbers[row][col]>largest) {//when i find a bigger element I have to update the bigest
        			largest = numbers[row][col];//largest=nmbers
        		}
        		
        	}
        		
		}
		System.out.println("The largest number is ...> " + largest);
		System.out.println("============");
		
		int max=numbers[0][0];
		for(int[]row:numbers) {
			for(int element:row) {
				if(element>max) {
					max=element;
					
				}
			}
		}
		System.out.println("the max number is ..>" + max);
    }
	
}

	


