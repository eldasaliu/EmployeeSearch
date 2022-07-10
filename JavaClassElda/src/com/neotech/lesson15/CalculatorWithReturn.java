package com.neotech.lesson15;

public class CalculatorWithReturn {

	
		int add(int a,int b) {
			int sum=a+b;
			return sum;
			
		}
int multiply (int a,int b) {
	//let me do it in one step
	return a*b;
	
}
double divide(double a, double b) {
	double result=a/b;
	return result;
	
	

}

int giveMeBackSmth() {
	System.out.println("i am inside giveMeBackSmth");
	return 3;
	
}
void dontgiveMeBackSmth() {
	System.out.println("i am inside dontgiveMeBackSmth");
}
}


