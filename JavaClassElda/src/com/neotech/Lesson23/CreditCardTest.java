package com.neotech.Lesson23;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard c = new CreditCard();
		c.balance = 2200.05;
		c.interest = 0.30;
		c.calculate();

		System.out.println("_______");

		Visa v = new Visa();

		v.balance = 1250.04;
		v.interest = 0.24;
		v.calculate();

		System.out.println("______");

		AX a = new AX();
		v.balance = 750.03;
		v.interest = 0.18;
		v.calculate();
	}

}
