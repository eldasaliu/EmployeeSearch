package com.neotech.Lesson23;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.study();
		System.out.println();

		NeotechStudent n = new NeotechStudent();
		n.study();
		n.smart();
		System.out.println();

		CollegeStudent c = new CollegeStudent();
		c.study();
		System.out.println();

		SchoolStudent h = new SchoolStudent();
		h.study();
		h.OnlineClasses();

		System.out.println();
		System.out.println("UP-Casting NeotechStudent --->");

		Student s1 = new NeotechStudent();
		s1.study();

		System.out.println("Down -Casting NeotechStudent ----> ");
		NeotechStudent n2 = (NeotechStudent) s1;
		n2.smart();

		System.out.println("UP-Casting CollegeStudent ----->");
		Student s2 = new CollegeStudent();
		s2.study();

		System.out.println("Down -Casting CollegeStudent-----> ");
		CollegeStudent c1 = (CollegeStudent) s2;
		c1.RunLate();

		System.out.println("UP-Casting SchoolStudent ----->");

		Student s3 = new SchoolStudent();
		s3.study();
		System.out.println("Down -Casting SchoolStudent-----> ");
		SchoolStudent h1 = (SchoolStudent) s3;
		h1.OnlineClasses();

	}

}
