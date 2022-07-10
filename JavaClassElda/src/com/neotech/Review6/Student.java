package com.neotech.Review6;

public class Student {
//instanace variables
	String name;
	int age;
	
	//static/class variables
	static String school;
	//Constractor
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}//instance method
	public void displayStudentInfo() {
		System.out.println("My name is:"+name+"And my age is"+age+ "And I study at"+school);
		
	}//static method and the difference is that in the method we have to create an object
	public static void main(String[]args) {
		//you can only access static variables
		//we cant use instance variable to use i need an object
	//name="Tuba" i cant do it like this
		Student.school ="Neotech";//yes
		//Student s1=new Student();//we cant use this one because we need a default a constructor with two parameters
Student s2=new Student("Brian",18);
s2.displayStudentInfo();
Student s3=new Student("Tuba",45);
s3.displayStudentInfo();




}}