package com.neotech.lesson15;

public class Calculator {
void add(int a,int b) {
	//this method will accept two numbers as parameters
//and will print the sum
int sum=a+b;
System.out.println(sum);


}
//this method will accept two numbers as parameters
//and will print the multiplication

void multiply(int num1,int num2) {
//	int result=num1*num2
	System.out.println(num1*num2);
}
//this method will accept two numbers as parameters
//and will print the division
void divide(double a,double b) {
	System.out.println("I will divide");
	double result=a/b;
	System.out.println("The result is");
}
}