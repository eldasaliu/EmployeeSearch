package com.neotech.Lesson17;

public class Homework1Lesson17 {

	public static void main(String[] args) {
		// Homework 1:
		// Create a String and print it in reverse order (Sunday → yadnuS).
		// Solve it using charAt(), toCharArray() and reverse() methods.
		// Note:
		// for charAt() and toCharArray() use String
		// for reverse you have to declare a StringBuffer object

		// toCharArray method
		String word = "Sunday";

		char[] charArray = word.toCharArray();
		for (char a : charArray) {
			System.out.print(a);
		}

		System.out.println();
		System.out.println("____");
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("-----");

		// charAt()

		for (int j = word.length() - 1; j >= 0; j--) {
			System.out.print(word.charAt(j));
		}
		
		System.out.println();
		System.out.println("======");

		// Using reverse()
		StringBuffer ab = new StringBuffer("Sunday");
		System.out.println(ab.reverse());
	}
	
//  Create a String and print it in reverse order (Sunday -> yadnuS). 
//  Solve it using charAt(), toCharArray()  and reverse() methods.
//  Note:
//      for charAt() and toCharArray() use String
//      for reverse you have to declare a StringBuffer object
​
//	public static void main(String[] args) {
//		String str = "Sunday";
//​
//		// 1st way, using charAt()
//		// System.out.println(str.charAt(5));
//		for (int i = str.length() - 1; i >= 0; i--) {
//			char c = str.charAt(i);
//			System.out.print(c);
//		}
//		System.out.println();
//​
//		// 2nd way, using toCharArray()
//		char[] charArray = str.toCharArray();
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			char c = charArray[i];
//			System.out.print(c);
//		}
//		System.out.println();
//​
//		System.out.println("----------------");
//​
//		// 3rd way, using reverse() method of StringBuffer
//		StringBuffer strBuff = new StringBuffer(str);
//		strBuff.reverse();
//		System.out.println(strBuff);
//​
//		System.out.println("----------------");
//​
//		// String is immutable, calling toUpperCase() method, will not change the string
//		str.toUpperCase();
//		System.out.println(str);
//​
//		// StringBuffer does Not have a toUpperCase() method
//		// strBuff.toUpperCase();
//
//}
