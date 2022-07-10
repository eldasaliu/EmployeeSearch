package com.neotech.Lesson23;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.salary=65000;
		emp.getPaid();
	System.out.println("-----------");
	
	
	Contructor ct=new Contructor();
	ct.salary=70000;
	ct.hourlyRate=50;
	ct.getPaid();
	
	
	System.out.println();
	FullTimeEmploye ft = new FullTimeEmploye();
	
	ft.salary = 75000;
	ft.getPaid();
	}

}
