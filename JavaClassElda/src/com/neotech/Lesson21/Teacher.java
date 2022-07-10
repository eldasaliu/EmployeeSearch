package com.neotech.Lesson21;

public class Teacher {

//	Homework 2: 
//	    Write a Java program called Teacher. Specify features and
//	    behavior of the Teacher class. Create 3 sub classes
//	    MathTeacher, ChemistryTeacher and PianoTeacher that will
//	    also have their own features and behavior.
//	    Test all 4 classes.
	String name;
	int age;
	double salary;

	public void teaching() {
		System.out.println(" The teachers are teaching in Middle School");

	}

	public void Info() {

		System.out.println(" Teacher " + name + " is " + age + " years old " + " and his salary is " + salary);
	}
}
