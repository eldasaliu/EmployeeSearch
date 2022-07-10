package com.neotech.Review4;

public class ArrayParameter {

	public static void main(String[] args) {
		 int[]array= {5,2,9,6,1,8};
		 System.out.println("The values inside the array are:");
for (int el:array) {
	System.out.println(el+" ");
}
System.out.println();
ArrayParameter ap=new ArrayParameter();
int result= ap.largestNumber(array);
System.out.println("the largest number int the array is:"+ result);
	}

	
	public int largestNumber(int[]arr) {
	
		
		int largest =arr[0];
		for(int el:arr) {
			if(el>largest) {
				largest=el;
				
			}
		}
		return largest;
		
		
		
			
			
		
		
	}
}
