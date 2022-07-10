package com.neotech.Lesson17;

public class StringBu {


		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//
		//when we want to change the string
		StringBuffer sb = new StringBuffer("Hello");
		//same formula used for String class as well!!
//		String str = new String("Hello");
		
		//the StringBuffer object is mutable
		sb.append(" All"); //string is added to the existing object
		System.out.println(sb);
		
		String str = "Hi";
		str.concat(" All"); //this creates a new String
		
		//String is immutable -- once created, it cannot be changed
		//StringBuffer, StringBuilder are mutable -- we can change the existing string object
​
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		sb.reverse();
		
		//other methods
		String subStr = sb.substring(2,5);
		System.out.println(subStr);
		
		//another example - object formula
		StringBuffer strBuff = new StringBuffer();
		StringBuilder strBld = new StringBuilder("We are tired,");
		strBld.append(" but we don't stop!");
		
		System.out.println(strBld);
​
		
	}

	public char[] reverse() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
​


}
}


