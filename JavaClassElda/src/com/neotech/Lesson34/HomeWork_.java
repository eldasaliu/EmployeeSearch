package com.neotech.Lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork_ {
//	 * Create a static method that will return a List of Exceptions. Inside your
//	 * method create objects of 4 exception classes using try and catch blocks and
//	 * store them inside your list. Call your method inside main and print name and
//	 * details of all Exception objects.
//	 */
	public static void main(String[] args) throws FileNotFoundException {
		List<Exception> l = Exceptions();
		Iterator<Exception> it = l.iterator();

		while (it.hasNext()) {
			it.next().printStackTrace();
		}
	}

	public static List<Exception> Exceptions() throws FileNotFoundException {
		List<Exception> l = new ArrayList<>();

		// 1
		int i = 4;
		int j = 0;

		try {
			System.out.println(i / j);

		} catch (ArithmeticException ae) {
			l.add(ae);
		} // 2
		try {
			String name = "Java";
			name.charAt(2);
			System.out.println(name);

		} catch (IndexOutOfBoundsException b) {
			l.add(b);

		} // 3
		int[] array = { 4, 5, 6, 7 };
		try {
			System.out.println(array[5]);
		} catch (ArrayIndexOutOfBoundsException x) {
			l.add(x);
		}
		// 4
		String path = " ";
		try {
			FileInputStream f = new FileInputStream(path);

		} catch (FileNotFoundException f) {
			System.out.println("Caught a FileNotFoundException ");

			l.add(f);

		}
		return l;
	}

}
