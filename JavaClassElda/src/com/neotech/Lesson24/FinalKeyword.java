package com.neotech.Lesson24;

public class FinalKeyword {
	//final variables
	public static String str ="Hello";
	public static final String str2="Bye";//Final variable =constant means that the final variable cant reasignn
	public static final double PI=3.1415926;//PI will always be 3.1415926
	public static void main(String []args) {
		str="Hi";
		//str2="Good Bye";//CE=compile error
		//local variable
		final String finalStr="Java is easy";
	//	finalStr ="Java is difficult";//CE cannot change final variable
		final int age=28;
		
	//after one year
		//age =29;
	
	
}
public final void Hello() {
	System.out.println("Iam a final method");//the final method canot be overridden
	
	
}
public final void hello(String name) {//yes i can ovrload a final methood
	System.out.println("Hello "+ name);
}
}
class SubClass extends FinalKeyword{
	//public void hello() {///CE cannot override final method
		//not overriding .Method signature is different .Just another method
	
	public void hello(int num ) {
		System.out.println("Hello from the child");
	}
}