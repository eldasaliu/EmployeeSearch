package com.neotech.Lesson27;

public class WrapperClasses {

	public static void main(String[] args) {
int num=10;
Integer number1=new Integer(10);//object//boxing putting an int inside integer object
//number1.intValue();//primitive///Unboxing getting the value from the object
//int num2=number1.intValue();
int num25=number1.intValue();
//String str1=new String("elda");//long way
//String str2="Liam";//short way
Integer number2 =3500;//Auto-Boxing converting from primitive to object auotomatic

int num26=number2.intValue();//Auto unboxing convert from object to primitive automatic
System.out.println(number2.toString());	

int min=Integer.MIN_VALUE;//the min value that can be stored in an int
System.out.println(min);
System.out.println(Integer.MAX_VALUE);
System.out.println("other wrappper classes");
//boolean bool1=new Boolean(true);

Boolean bool2=true;//auto boxing
System.out.println(bool2);
Byte b1=25;
System.out.println(b1);
System.out.println(Byte.MAX_VALUE);//the max value that can be storrred in int
byte b2=b1;//auto unboxing
Double d1=3.45;//auto boxing
Character c1=new Character('P');//Boxing,storing a char into a character
Character c2='X';//Auto Boxing=The short way

}
}
