package com.neotech.Lesson22;

public class Programing {
//	Homework 1:
//	    Create a class named 'Programming'. While creating an
//	    object of the class, if nothing is passed to it, then the
//	    message "I love programming languages" should be
//	    printed. If some String is passed to it, then in place of
//	    "programming languages" the value variable should be
//	    printed. Example, if we pass "Java", then "I love Java"
//	    should be printed.
	String word;

	public Programing() {//these two we call overloading constructor

		System.out.println("I love programing languages");

	}

	Programing(String word) {
		this.word = word;

	}

	public void Java() {

		System.out.println("I love " + word);

	}

	public static void main(String[] args) {
		Programing p = new Programing();

		Programing p1 = new Programing("Java");
		p1.Java();
	}
}