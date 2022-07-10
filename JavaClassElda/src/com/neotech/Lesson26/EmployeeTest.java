package com.neotech.Lesson26;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee ();
		//emp.name() we can get access to the namebecause its private but we can get access to getName
            
            emp.setName("Damla");
            System.out.println(emp.getName());
            
            emp.setAge(25);
            System.out.println(emp.getAge());
            
            emp.getSalary(90000);
            System.out.println(emp.getSalary());
}
	}