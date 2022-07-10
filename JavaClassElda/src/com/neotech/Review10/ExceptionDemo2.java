package com.neotech.Review10;

public class ExceptionDemo2 {

	public static void main(String[] args) {
int [] numbers=new int[3];

try {
numbers[0]=10;
numbers[1]=20;
numbers [2]=30;
numbers[3]=40;//is an error because out of bound
numbers[4]=50;
System.out.println("Will code come here");

}catch(Exception e) {
	//System.out.println(e);
//	System.out.println(e.getMessage());
	//e.printStackTrace();
	
	//I can print a meangiful message
	System.out.println("You are trying to store outside of the array");
	
}
System.out.println("Continues code execution");
}

}
