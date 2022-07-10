package com.neotech.Lesson17;

public class Homework2 {

	public static void main(String[] args) {
		// //homework yadoT si yadseuT dna ew era ni a avaJ ssalc
		String s = "Today is Tuesday and we are in a Java class";
		String[] result = s.split(" ");

		for (String d : result) {
			char[] charArray = d.toCharArray();

			for (int i = charArray.length - 1; i >= 0; i--) {

				System.out.print(charArray[i]);

			}
			System.out.print(" ");

		}
		
		
		// Write a program to print out the following conversion:
		// Today is Tuesday and we have a Java Class!!! to
		// yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
	​
//		public static void main(String[] args) {
//			String str = "Today is Thursday and we have a Java Class!!!";
//	​
//			// I will do it in two steps
//			// 1. Split the long String into words
//			// 2. Reverse every word
//	​
//			String[] strArray = str.split(" ");
//			Homework2 h2 = new Homework2();
//	​
//			for (String element : strArray) {
//				String rev = h2.reverseString(element);
//				System.out.print(rev + " ");
//			}
//	​
//		}
//	​
//		String reverseString(String a) {
//			String reverse = "";
//	​
//			char[] letters = a.toCharArray();
//			for (int i = letters.length - 1; i >= 0; i--) {
//				reverse += letters[i];
//			}
//	​
//			return reverse;
//		}
//	}
//	}
//	
//}
