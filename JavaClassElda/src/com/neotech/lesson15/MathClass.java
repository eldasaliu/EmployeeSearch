package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
	Calculator calc=new Calculator();
	System.out.println("Addition");
	calc.add(6, 3);
	calc.add(200,80);
	System.out.println("Multiplication");
	calc.multiply(4,5);
	//calc.multipy(4,2.5)error because we have doubles
	System.out.println("Devision");
	
	calc.divide(8.8,2.2);
	calc.divide(10.5,5);
	
	}
	

}
