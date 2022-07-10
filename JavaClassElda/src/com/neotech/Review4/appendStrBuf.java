package com.neotech.Review4;

public class appendStrBuf {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Hello");
		StringBuffer str2 = new StringBuffer("World");
		
		//HellodlroW
		str.append(str2.reverse());
		
		System.out.println(str); //HellodlroW
		
		str.reverse().append(str2.reverse());
		
		System.out.println(str);
		
​
		
	}
​
	
	
	
​

	}

}
