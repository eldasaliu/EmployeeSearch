package com.neotech.Lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyBlock {

	public static void main(String[] args) {
String filePath="";
try {
	

FileInputStream fis=new FileInputStream(filePath);
System.out.println("End of try block");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
		
	}

finally {
	//this is always executed
	System.out.println("I am finally block ");
}
System.out.println("End of code");

}
}