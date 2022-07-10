package com.neotech.Lesson23;

public class CreditCard {
//	Homework 1:
//	    ▪ Create a class CreditCard and define two variables, balance and interest.
//	    ▪ Create an instance method that will calculate the interest based on the given balance.
//	    ▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
//	    ▪ Call the method by creating an object of each of the three classes.

	double balance;
	double interest;

	void calculate() {
		System.out.println("Monthly interest per month is " + (balance * interest));
	}

}

class Visa extends CreditCard {

}

class AX extends CreditCard {
	double interest;

	void calculate() {
		System.out.println("Monthly interest per month is " + (balance * interest));
	}
}