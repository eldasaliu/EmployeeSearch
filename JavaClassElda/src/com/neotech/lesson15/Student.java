package com.neotech.lesson15;

public class Student {
	
//Create a class Student that will have a method getGrade.
//Your method should accept the score of a student and return a grade:
//    score > 90 - A
//    score > 80 - B
//    score > 70 - C
//    score > 50 - D
//    anything else - F
	
	
int getGrade(int score ) {
	
	
	if (score > 90){
		System.out.println("Grade is : A");
		
		
	}else if (score>80) {
		System.out.println("Grade is :B");
		
	}else if(score>70) {
		System.out.println("Grade is:C");
		
	}else if(score >50) {
		System.out.println("Grade is:D");
		
	}else {
		System.out.println("Grade is :F");
	
	}
  return score ;
}


public static void main(String[] args) {
	Student a=new Student();
	int b1 =a.getGrade(85);
	System.out.println(b1);
	
	int b2=a.getGrade(70);
	System.out.println(b2);
}
}


