package com.neotech.Lesson34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 * Create a static method that will return a List of Exceptions. Inside your
		 * method create objects of 4 exception classes using try and catch blocks and
		 * store them inside your list. Call your method inside main and print name and
		 * details of all Exception objects.
		 */

		List<Exception> le = getAllExceptions();

		// iterate over the list to see what exceptions we caught
		Iterator<Exception> it = le.iterator();

		while (it.hasNext()) {
			it.next().printStackTrace();
//			System.out.println(it.next());
		}

	}

	public static List<Exception> getAllExceptions() {
		List<Exception> le = new ArrayList<>();

		// lets create some Exception situations

		// adding objects to the list - same as with the objects we are used to
		List<String> ls = new ArrayList<>();
		ls.add("Sabah");
		ls.add("Tuba");

		// 1st Exception - ArrayIndexOutOfBoundsException
		int[] array = { 3, 4, 6, 2, 8 };

		try {
			System.out.println(array[6]);
		} catch (ArrayIndexOutOfBoundsException iob) {
			le.add(iob);
		}

		// 2nd Exception - ClassCastException

		try {
			Object obj = new Double(50);
			Integer i = (Integer) obj;
		} catch (ClassCastException cce) {
			le.add(cce);
		}

		// 3rd Exception - ArithmeticException
		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			le.add(ae);
		}

		// 4th Exception - NegativeArraySizeException

		try {
			int[] negArray = new int[-1];
		} catch (NegativeArraySizeException nase) {
			le.add(nase);
		}

		return le;
	}

}
