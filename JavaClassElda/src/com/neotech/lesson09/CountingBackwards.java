package com.neotech.lesson09;

public class CountingBackwards {

	public static void main(String[] args) {
		//4321
		//4321
		//4321
		//4321
		
		for (int row=1;row<=4;row++) {
			for(int col=4;col>=1;col--) {
				System.out.print(col);
				
			}
			System.out.println();
		}
		//4444
		//3333
		//2222
		//1111
		
		System.out.println("======");
		for(int row=4; row>=1;row--) {
			for(int col =1;col<=5;col++) {
				System.out.print(row);
				
			}
			System.out.println();
		}
		System.out.println("======");
		
		//same pattern different solution
		for (int row=1; row<=4;row++) {
			
			for (int col=1;col<=4; col++) {
				System.out.print(5-row);
				
				
			}
			System.out.println();
			
			
	
		}
	}
	

}
