package com.neotech.lesson11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[] [] numbers =new int [2][4];//[rows]	[colums]	
		
		//1st row,row with index 1
		numbers [0][0]=10;
		numbers[0][1]=15;
		numbers[0][2]=20;
		numbers[0][3]=25;
		//2nd row,row with index 1
		numbers[1][0]=33;
		numbers[1][1]=36;
		numbers[1][2]=39;
		numbers[1][3]=42;
		
		System.out.println("lets print 39");
		System.out.println(numbers [1][2]);
		System.out.println("lets print 25");
		System.out.println(numbers [0][3]);
		
		
		System.out.println("-----");
		//2-D Array intialization//if we have the values at the begining
		
		int[] []	nums= {
				{3,6,9,12},
				{5,10,15,20},
				{19,18,27,36} ,
		};
		System.out.println("Lets print 36");
		System.out.println(nums[2][3]);
		//there is no row with index 3//run time error
		//System.out.println([3][0]);
		
		
	}


}