package com.neotech.Lesson23;

public class Employee {
	double salary;
	void getPaid() {//this method is overriden
		System.out.println("the employee salary is"+ salary);
	}

}
class Contructor extends Employee{
	double hourlyRate;
	void getPaid(int a) {//this method overrides the oarent getPaid()
		System.out.println("The contractor hourly rate is:"+ hourlyRate);
	}
}
class FullTimeEmploye extends Employee{
	
}