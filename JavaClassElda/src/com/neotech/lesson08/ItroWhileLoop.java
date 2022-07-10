package com.neotech.lesson08;

public class ItroWhileLoop {

	public static void main(String[] args) {
		int time=8;
		if(time<9)// condition
		{//begin if body
			
			System.out.println("Good morning");
		}//end if body
		
		
		System.out.println("======");
		
		while (time>12)//condition
		{//begin while body
			System.out.println(time);
		}//end while body
		
		//How to print from 20 to 30 [20-30]
		
		int a=20;
		while(a<30) {
			System.out.print((a < 30 ) + " ");
			//post increment we print and then we increment
			System.out.println(a++ + " ");
			
			a++;
			//a++
		System.out.println(++a + " ");
		
		//how to print numbers from 5 to 25;
		int b=5;
		while (b<=25);{
			System.out.println(b);
			// increment
			b++;
			
		}
		
		
		//How do we print numbers from 10 to 1?
		int c=10;
		while (c>1) {
			System.out.println(c+ " ");
			//Decrement
			--c;//or c--
			
		}
		
		// how to print numbers from 50 to 1
		
		}
			

	}

}
