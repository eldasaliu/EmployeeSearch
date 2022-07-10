package com.neotech.Lesson35;

import com.neotech.lesson35.BalanceException;

class BalanceException extends RuntimeException {
	public BalanceException(String sms) {
		super(sms);
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {

		Exception e = new Exception();
		ArithmeticException ae = new ArithmeticException();

		// throw ae;

		// throwException();

		try {
			withdraw(2000, 2500);
		} catch (BalanceException be) {
			System.out.println(be.getMessage());
		}
	}

	public static void throwException() {
		throw new ArithmeticException();
	}

	public static void withdraw(int balance, int amount) {
		if (amount > balance) {
			throw new BalanceException("You have insufficient funds!");
		}
	}

}
