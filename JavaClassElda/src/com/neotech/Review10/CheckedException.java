package com.neotech.Review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {

String projectPath=System.getProperty("user.dir");
String filePath=projectPath +"/extra/domo.properties"	;
try {

FileInputStream fileIS=new FileInputStream(filePath);
}catch(FileNotFoundException e) {
	//e.printStackTrace();
	System.out.println(e.getMessage());//in this way i can find exactly what is the problem
}
System.out.println("Happy ending");
	}

}
