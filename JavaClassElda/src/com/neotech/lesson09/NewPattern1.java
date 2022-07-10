package com.neotech.lesson09;

public class NewPattern1 {

	public static void main(String[] args) {
		//1111
		//222
		//33
		//4
for (int row=1;row<=4;row++) {
	
	for (int col=1;col<=5-row;col++) {
		
		System.out.print(row);
	}
	System.out.println();
	//same pattern different solution
	//1111
	//222
	//33
	//4
	for (int row=1;row<=4;row++) {
		
		for (int col=4;col<=row;col--) {
			
			System.out.print(row);
		}
		System.out.println();
	}
}
	}
}
	
	

	


	
