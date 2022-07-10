package com.neotech.Review4;

public class Teacher {
String name;
double salary;
String subject;


void teach() {
	System.out.println(name+ " is teaching"+ subject);
	
		
	}
void yellAtStudent(String student) {//when we want to specify the name of the student that she is yelling
	System.out.println(name + "is yelling at "+student);
}

			
}

