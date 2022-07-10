package com.neotech.Review4;

public class StringMethods {
	//String is a class that somebody has created 

public static void main(String[] args) {
	String str="Pershendetje";
	System.out.println(str.length());
	System.out.println(str.isEmpty());
	
	
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
	System.out.println(str);//the original has not changed
boolean equal=str.equals("peshendetje");
System.out.println(equal);

System.out.println(str.equalsIgnoreCase("pershedentje"));

System.out.println("=====");
System.out.println(str.contains("SH"));
System.out.println(str.contains("SH".toLowerCase()));
boolean starts =str.startsWith("p");
System.out.println(starts);
System.out.println("Does Pershendetje start with Per?" );
System.out.println(str.startsWith("Per"));
System.out.println("Does Pershendetje end with Per?" );
System.out.println(str.endsWith("etje"));


String str2="Hello"+ " " + "world" ;
	System.out.println(str2);
	
	String str3="Hello".concat("").concat("World");//Method chaining
	System.out.println(str3);
	
	
	System.out.println("Hello".toUpperCase().concat(" ").concat("World"));
	//"Hello.length().concat("World");//compile error
	
	System.out.println("Hello".length()+3);//5 letter +3
	String str4="     Hello World     ";
	System.out.println(str4.length());
	//or 
	System.out.println(str4.trim().length ());//(trim)first will remove the spaces and then will get the length 11
	//
	System.out.println(str4.trim());
	String str5="Hi There";
	char letter=str5.charAt(5);
	System.out.println(letter);
	
	System.out.println("====");
	
	System.out.println(str5.indexOf('h'));
	System.out.println(str5.indexOf('e'));
	//how can i get the index of second e
	int indexOfSecondE=str5.index
	
}

}
