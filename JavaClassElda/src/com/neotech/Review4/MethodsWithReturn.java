package com.neotech.Review4;

public class MethodsWithReturn {
	boolean isOdd(int num) {//1st way
		boolean result;
		if(num%2==1) {
			result=true;
			
			
		}else {
			result=false;
			
		}
		return result;
	}
	boolean isOddEnhanced(int num) {//2 way short way
		return num%2==1;
	}
	public static void main(String[] args) {
		String name="Elda";
		int numOfChars=name.length();
		System.out.println("The length of "+name +" is "+ numOfChars);
		
		MethodsWithReturn m=new MethodsWithReturn();
		boolean res=m.isOdd(90);
		System.out.println("90 is odd--->"+ res);
		System.out.println(m.isOdd(57));
		System.out.println(m.isOddEnhanced(59));
	}

}
