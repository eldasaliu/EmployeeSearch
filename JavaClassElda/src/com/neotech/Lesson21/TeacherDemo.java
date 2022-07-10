package com.neotech.Lesson21;

public class TeacherDemo {

	public static void main(String[] args) {
		Teacher a = new Teacher();
		a.name = "Alicia";
		a.age = 27;
		a.salary = 80000;

		a.teaching();

		System.out.println();

		MathTeacher b = new MathTeacher();
		b.name = "Jack";
		b.age = 35;
		b.salary = 90000;
		b.equations = "Linear Equations";
		b.teaching();
		b.displayInfo();

		System.out.println();
		ChemistryTeacher c = new ChemistryTeacher();

		c.name = "Amaris";
		c.age = 25;
		c.salary = 110000;
		c.periodicTable = "Nitrogen";
		c.teaching();
		c.dispalyInfo();

		System.out.println();
		PianoTeacher d = new PianoTeacher();
		d.name = "Ester";
		d.age = 25;
		d.salary = 50000;
		d.piano = "Piano basics";
		d.teaching();
		d.displayInfo();
	}

}
