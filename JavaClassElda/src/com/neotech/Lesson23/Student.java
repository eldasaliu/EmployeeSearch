package com.neotech.Lesson23;

public class Student {
//	Homework 2:
//	    ▪ Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
//	    ▪ Define common behavior within the parent class and override some of the methods in the child classes
//	    ▪ Define some methods specific to the child classes
//	    ▪ Write an example of achieving run time polymorphism
	protected void study() {
		System.out.println("All students study ");

	}
}

class NeotechStudent extends Student {
	//the visibility was increasedfrom protected to public .Its ok am overriding yes
	public void study() {//it has to be the same name like the parent class so you can override example study for each subclass
		System.out.println("All NeotechStudent study ");
	}

	public void smart() {
		System.out.println("Neotech students are very smart ");
	}

}

class CollegeStudent extends Student {
	public void study() {
		System.out.println("All CollegeStudents study ");
	}

	public void RunLate() {
		System.out.println("Sometimes students don't come in time ");
	}
}

class SchoolStudent extends Student {

	public void study() {
		System.out.println("All SchoolStudents study ");
	}

	public void OnlineClasses() {
		System.out.println("Most of the students take online classes ");
	}

}
