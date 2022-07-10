package com.neotech.Review4;

public class Student_ {

	/*
	 * Create a Class called Students ▪ Create three variables studentName,studentID
	 * and numberOfStudents (should be a static variable) ▪ Create three objects of
	 * the Students Class ▪ Set the value for studentName, studentID and increment
	 * the numberOfStudents for each object ▪ Print out total the number of students
	 */
	String studentName;
	int studentId;

	static int numberOfStudent;

	public static void main(String[] args) {

		Student_ s1 = new Student_();
		s1.studentName = "Elda";
		s1.studentId = 5;
		Student_.numberOfStudent++;

		Student_ s2 = new Student_();
		s2.studentName = "Bernard";
		s2.studentId = 7;
		Student_.numberOfStudent++;

		Student_ s3 = new Student_();

		s3.studentName = "Liam";
		s3.studentId = 10;
		Student_.numberOfStudent++;
		System.out.println("The total of stutents is----> " + Student_.numberOfStudent);

	}

}
