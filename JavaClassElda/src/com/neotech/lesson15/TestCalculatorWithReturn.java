package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {
	CalculatorWithReturn calc=new CalculatorWithReturn();
	int result=calc.add(9,5);
	System.out.println(result);

	int result2=calc.multiply(5,4 );
	System.out.println(result2);
	
	double result3=calc.divide(8, 2);
	System.out.println(result3);
	
	int var1=calc.giveMeBackSmth();
	calc.dontgiveMeBackSmth();
	
	}

}
