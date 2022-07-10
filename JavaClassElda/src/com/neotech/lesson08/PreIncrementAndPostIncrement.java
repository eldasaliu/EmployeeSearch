package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
	 //++ Increment
		//-- ..> Decrement
		int x;
		int y=10;
				//post Increment...> first use the variable and then increase it
				x =y++;//1.preform x=y
			///2.y=y+1
				System.out.println(x);
				System.out.println(y);
				
				
				System.out.println("========");
				
				
				int a;
				int b=15;
		
				//preIncrement....>first increase the variable then assign
				
				//1.b=b+1
		a=++b;		//2.preform a=b
		
		
		System.out.println("=======");
		
		
		//Decrement 
		
		int c;
		int d= 15;
				c=--d;
		/// Pre decrement
		c=--d;
		System.out.println(c);
		System.out.println(d);
		
		//Post decrement
		System.out.println(" =====");
		int e;
		int f=20;
		e=f--;
		System.out.println(e);
		System.out.println(f);
		

		
	} 
	

}
