package com.neotech.Lesson20;

public class ConstructorInfo {
	
	String name;
	
	int age;
	void method() {
		
	}
	//no return type//exactly the same as the the name class
	ConstructorInfo()
	{
		System.out.println("I am a default constructor");
	}
	
	

	public static void main(String[] args) {
		 ConstructorInfo ci=new ConstructorInfo();
		 System.out.println(ci.name);
		System.out.println(ci.age); 
		
	}

}
