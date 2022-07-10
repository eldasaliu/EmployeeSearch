package com.neotech.Lesson18;

public class Employee1 {

	public static void main(String[] args) {
		
		Employee.Ceo="Elion";
		
		Employee emp1 =new Employee();
		
		emp1.Id=18;
		emp1.salary=(int) 50.000;
		emp1.printInfo();
		
		Employee emp2=new Employee();
	    emp2.Id=47;
	    emp2.salary=95000;
		emp2.printInfo();
		Employee.Ceo="Ahmet";
		emp1.printInfo();
		emp2.printInfo();
		
	}

}
