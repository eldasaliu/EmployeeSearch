package com.neotech.Lesson17;

public class StringImmutable {

	public static void main(String[] args) {
		// 
		String str="Hello";
		str.concat("World");
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		//reassinging but not changing
		
		str=str.concat(" World");
System.out.println(str);	

//String str="Hello"; this points to some string created "Hello,if we concatenate
	//str=str +"All";this points to a new string -if a string was already existing (
//then it will print that

}
}
