package com.neotech.Review8;

import java.util.ArrayList;

public class Student {
	String name;
	
public  Student(String name) {
	this.name=name;
	
}
public void studentInfo() {
	System.out.println("Student name is" + name);
	
}
}
public class StudentList {
	
	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<>();
		Student s1=new Student("Reyhan");
		s1.studentInfo();
		//System.out.println(s1);
	}
}