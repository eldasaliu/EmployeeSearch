package com.neotech.lesson07;

public class LogicalNot {

	public static void main(String[] args) {
// ! (Not)- reverse the calue of a boolean variable
		boolean b1= !true;// not true
		System.out.println( b1);
		boolean b2= !false;
		System.out.println(! b2);
		//! can go in front of any boolean expression
		System.out.println(!(6<4));
		boolean cold= true;// not true ...> false
		if (!cold)// not false ...> true
		{
			System.out.println("Cold!");
		}
		int x =12;
		if ( x==12) {
			System.out.println("X is 12");
			
			
		}
		else {
			System.out.println("x is not 12");
			// !can be conbined with =..> !=
			if (x !=12)// same as !(x==12)
			{
				System.out.println(" X is not 12");
			}
		}
	}

}
