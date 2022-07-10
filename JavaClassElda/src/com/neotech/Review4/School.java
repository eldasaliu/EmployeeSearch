package com.neotech.Review4;

public class School {
public static void main(String[] args) {
	Student student1=new Student();
	student1.name="John";
	student1.studentNr=3;
	student1.gradeLevel=1;
	Student student2=new Student();
	student2.name="Jacob";
	student2.studentNr=907;
	student2.gradeLevel=14;
	
	Teacher teacher=new Teacher();
	teacher.salary=90.000;
	teacher.name="MRS Nancy";
	teacher.subject="Math";
	
	System.out.println("Lets call the ");
	student1.study();
	student2.sleep();
	student2.study();
	teacher.teach();
	teacher.yellAtStudent( student1.name);//when we want to specify the name of the student that she is yelling
	
}
}
