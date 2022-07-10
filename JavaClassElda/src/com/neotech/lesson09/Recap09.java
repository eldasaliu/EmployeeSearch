package com.neotech.lesson09;

public class Recap09 {

	public static void main(String[] args) {
	//Let's print good evening 5 times
		
	//System.out.println( "Good Evening" );
	
	// second way using while loop
	int count=1;
	while(count <=5) {
		System.out.println("Good Evening");
		
		count ++;//increase by 1
		
	}
		System.out.println("-------");
		// 3 rd way.do wile loop
		int num=1;
		do {
		System.out.println("Good evening");	
		num++;
		}while(num<=5);
		

		System.out.println("=======");
		
		
		int m=10;
		while (m<=5) {
			System.out.println("Good Night");
			m++;
			//to print we have to have the condition true
		
			
		System.out.println("Using do while");
			int n=10;
			do {
				System.out.println("Good night");
				
				n--;
			}while(n<=5);
				
	
		}
		

	}

}
