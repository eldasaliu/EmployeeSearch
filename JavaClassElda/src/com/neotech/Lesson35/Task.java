package com.neotech.Lesson35;
class AgeExpection extends RuntimeException{
	public AgeExpection(String age) {
		super(age);
	}
}
public class Task {//Create a method to check age eligibility that will throw a runtime exception.
//Method should throw an exception if age is less than 16.

	public static void checkage(int age) throws Exception {

if (age<16) {
	throw new Exception("It is not allowed");
}//we can create an ageEligibilityExceptio class to deal with thiis situation
	
	else {
		System.out.println("It's allowed");
	}
	}
	public static void main1(String[]args ){
	 try {
		 checkage(14);
		 
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 
	}

}
