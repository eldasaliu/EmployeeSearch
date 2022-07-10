package com.neotech.Lesson26;

public class Employee {
//we define private variables
	private String name;
	private int age;
	private double salary;
	
	//we define getters and setters
	//we are Encapsulating these 
	//we call this Getter we are returning name:has a return type 
	//and no arguments
	public String getName() {
		
		return name;
		
	}
	
	//setter...> we need an argument but we dont need to send something back
	public void setName(String name) {
		 
		this.name=name;
	}
	//getter:retun type and no argument
	public int getAge() {
		return age;
		
		
	}
	//setter :has an argument ,no return
	public void setAge(int age) {
		this.age= age;
		//or we can provide a condition

	}//we have this private info an we chose which we have to mmake p
	//public
	
	
	//getter
public double getSalary() {
	return salary;
	
}

//setter
public void getSalary(double salary) {
	this.salary=salary;
}
}