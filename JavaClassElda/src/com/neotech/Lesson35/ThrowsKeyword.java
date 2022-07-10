package com.neotech.Lesson35;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) {

		calculator();
		
		try {
			read("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Handled");
		}

	}

	
	public static void calculator() 
	{
		try {
		division(9,3);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled!");
		}
	}
	
	
	public static void division(int a, int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}
	
	
	public static void read(String filePath) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(filePath);
	}
	
	
	
}
