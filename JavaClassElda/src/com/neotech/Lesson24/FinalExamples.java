package com.neotech.Lesson24;

public class FinalExamples {
	//Create a class FinalExamples that has one final String variable with an initial value and one final method printVariable().
	//In the main method create an object of FinalExamples class and try to reassign a value to instance variable.
	//Create a sub class of FinalExamples named ChildClass and try to override the printVariable() method.
	final String str="I love Java";
	final void printValue() {
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		FinalExamples fe=new FinalExamples();
				//fe.str="I hate Java" we cannot reasign cannot be changed	}
				fe.printValue();
		
	class childClass extends FinalExamples{
		//can i do this ?Yes just another method
	void printValue(String name);
	
	}//final method cannot be overriden 
		//void printValue() {
			 
		}
	}//A final class cannot be inherited, a final method cannot be overridden
//and a final variable// cannot be reassigned.//
}
}