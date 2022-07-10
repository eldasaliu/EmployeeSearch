package com.neotech.Review4;

public class Student {
	// Create a class of Student
	// int studentNr, String name, int gradeLevel
	// study(), sleep()
	// Create a class of Teacher
	// String name, double salary, String subject
	// teach(), yellAtStudent()
	// Create a class School with a main method
	// Create 2 objects/instances of Student class
	// Create 1 object of Teacher class
	
	String name;
	int studentNr;
	int gradeLevel;
	
	void study() {
		System.out.println(name+ " is studying");
		
	}
	void sleep() {
		System.out.println(name+ " is sleeping");
		
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.name="John";
		st.studentNr=3;
		st.gradeLevel=1;
		
		st.study();
		st.sleep();
		
	}
}
