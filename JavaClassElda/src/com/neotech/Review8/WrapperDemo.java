package com.neotech.Review8;

public class WrapperDemo {

	public static void main(String[] args) {
		int num1=5;
		Integer integer1=new Integer(num1);//if we are outting primitig data types inside an object this is called Boxing
		int num2=integer1.intValue();//Unboxing/Unrapping//this is a long way
		
		
		//easy way
		int num3=10;
		Integer integer3=num3;//Auto Boxing,Auto wrapping,Auto converting
		int num4=integer3;//Auto Boxing,Auto wrapping,Auto converting
		
//Double wrapper
		double d1=3.5;
		Double d2=d1;//Auto Boxing
		Double d3=4.3;//Auto Boxing
		
		Boolean b1=true;//Auto Boxing
		Character c1='S';//Auto Boxing
		
	}

}
