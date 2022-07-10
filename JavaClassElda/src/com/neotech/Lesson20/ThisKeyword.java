package com.neotech.Lesson20;

public class ThisKeyword {
int a,b;
ThisKeyword(){
	System.out.println("Iam a default constructor");
}
ThisKeyword(int a, int b){
	
	this.a=a;//we use this when we have the same name a=a
	this.b=b;
	
}


void sum(int a,int b)
{
	System.out.println("Sum of local variable " +(a+b));
	System.out.println("sum of instance " +(this.a + this.b));
}
public static void main(String[] args) {
	ThisKeyword obj1=new ThisKeyword(10,20);
	obj1.sum(100,200);
	System.out.println(obj1.a);
	ThisKeyword obj2=new ThisKeyword();
	obj2.sum(20,40);
	System.out.println(obj2.a);
	
	
	}
}