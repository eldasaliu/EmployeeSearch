package com.neotech.Lesson20;

public class School {

	public static void main(String[] args) {
​
		// 1st way, using default constructor
		Student s1 = new Student();
		s1.displayInfo();
​
		s1.name = "Ozer";
		s1.address = "123 Florida";
		s1.displayInfo();
​
		System.out.println("----------------------------");
		// 2nd way, using the constructor with 2 parameters
		Student s2 = new Student("Mustafa", "123 Orlando");
		s2.displayInfo();
​
		System.out.println("----------------------------");
		// 3rd way, using the constructor with 1 parameter
		Student s3 = new Student("Emrah");
		s3.displayInfo();
​
		System.out.println("----------------------------");
		s3.address = "123 New Jersey";
		s3.displayInfo();
​
	}
​
}
}
