package com.neotech.Review7;

public class MethodOverloading {
//you have the same method name multipllytimes but the signuture should be different so =method name+ parametrs
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.methodOne("ABC");
		mo.methodOne(4,8);
		
		//Polymorphisem
		//Method Overloading
		
	}
	public void methodOne() {//method 1
		
	}
	//we can have the same method name but the parameters should be different
	public void methodOne(int a) {
		
	}
	public void methodOne(String a) {
		
	}
	
	protected void methodOne(int a,int b) {
		
	}
	
	public void methodOne(double a,double b) {
		
	}
	
	public void methodOne(double a,int b) {
		
	}
	public void methodOne(int a ,double b) {
		
	}
	}
