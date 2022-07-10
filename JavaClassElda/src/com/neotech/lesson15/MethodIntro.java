package com.neotech.lesson15;

public class MethodIntro {
// Let me create a method for greeting
	void greet () {
		System.out.println("Hello");
		System.out.println("How are you doing?");
		System.out.println("Bye");
	}
	//Let mee create a method that will be greetingby name
	void greet2(String name) {
		System.out.println("Hello" + name);
		System.out.println("How are you doing?");
		System.out.println("Bye"+ name);
		
	}
	public static void main(String[] args) {
		MethodIntro object =new MethodIntro();
		object.greet();
		object.greet();
		
		System.out.println("++++++++");
		
		object.greet2("Parviz");
		object.greet2("Mustafa");
		//object.greet2();//compile error
		//object.greet2('M');//commpile error
	}//object.greet2(5) ;//the method expects a string not an integer
	}//object.greet2("");//no error is a emty string

