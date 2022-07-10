package com.neotech.Lesson20;

public class Homework2 {

	Homework2() {
		System.out.println("Dfault constractor");

	}

	public Homework2(String name, String address) {
		System.out.println("Public print : " + name + ", " + address);
	}

	Homework2(int number, String name) {
		System.out.println("Private print " + number + ", " + name);
	}

	protected Homework2(int ID, char grade, String name) {
		System.out.println("Protected print: " + ID + ", " + grade + ", " + name);

	}

	public static void main(String[] args) {
		Homework2 h1 = new Homework2();
		Homework2 h2 = new Homework2("Elda", "25-02 Nj");
		Homework2 h3 = new Homework2(5, "Benn");
		Homework2 h4 = new Homework2(4, "Jenn");
		Homework2 h5 = new Homework2(02, 'B', "Liam");
	}
}
