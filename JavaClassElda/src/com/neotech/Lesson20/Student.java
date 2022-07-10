package com.neotech.Lesson20;

public class Student {
	String name;
	String address;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public void displayInfo(String name, String address) {

		System.out.println("Student name is " + name + " and the address is" + address);
	}

	public static void main(String[] args) {
		Student st1 = new Student("Elda", "24-04 A Fair Lawn, Nj");

		st1.displayInfo("Elda", " 24-04 A Fair Lawn, Nj ");
		
		
		
		
//		// Write program as a Student class
//		// that has instance variables name and address.
//		// Create a constructor that will initialize those variables.
//		// Print name & address of given student using displayInfo method.
//	​
//		// instance variables
//		String name;
//		String address;
//	​
//		// This constructor will be there, if don't define any constructors
//		public Student() {
//	​
//		}
//	​
//		// 2nd constructor, accepts student name & address
//		public Student(String name, String address) {
//			this.name = name;
//			this.address = address;
//		}
//	​
//		// 3rd constructor, accepts only student name
//		public Student(String stName) {
//			name = stName;
//		}
//	​
//		public void displayInfo() {
//			// String name = "Timucin";
//			// System.out.println("Local Name -> " + name);
//			System.out.println("Name -> " + this.name + " Address -> " + address);
//		}
//	​
//		public static void printSmth() {
//			System.out.println("Hi there!");
//		}
//	​
//	}
	}
}
