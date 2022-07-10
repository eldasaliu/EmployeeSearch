package com.neotech.Lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HomeWork3 {

//		Homework 3:
//		    Create a Set collection that will hold Objects of Student Type.
//		    In this set we do not care about the insertion order. 
//		    Each student object should have name and studentID. Display name of each student.
	 String name;
     int Id;

	public HomeWork3(String name, int Id) {
		this.name = name;
		this.Id = Id;

	}

	void displayInfo() {
		System.out.println("The student name is : " + name + " and the student Id is " + Id);
	}

	public static void main(String[] args) {

		Set<HomeWork3> Student = new HashSet<>();//if we dont care we use HashSet
		Student.add(new HomeWork3("Elda", 02));
		Student.add(new HomeWork3("Liam", 45));
		Student.add(new HomeWork3("Amy", 78));
		Student.add(new HomeWork3("Tracy", 6));
//Student s1=new Student("Elda",12) we can do it like this too
		Iterator<HomeWork3> it = Student.iterator();
		HomeWork3 s=it.next();
		while (it.hasNext()) {
			it.next().displayInfo();
		}
 
	}

}
