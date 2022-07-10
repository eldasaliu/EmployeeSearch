package com.neotech.Review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

	String projectPath=System.getProperty("user.dir") ;
	System.out.println(projectPath);
		
	String filePath=projectPath +"/extra/demo.properties"	;
	System.out.println(filePath);	
	
	FileInputStream fileIS=new FileInputStream(filePath);
	
Properties proper=new Properties();
proper.load(fileIS);

System.out.println(proper);
//1st way
Object firstName=proper.get("FirstName");
System.out.println(firstName);

//2nd way,the correct way that we have to use
String school=proper.getProperty("School");
System.out.println(school);

String age=proper.getProperty("Age");
System.out.println(age);

//Add more key value pairs
proper.setProperty("SSN","247-982587" );


//I can re-assing values
proper.setProperty("Age"," 23");
System.out.println(proper);
//Now let us save into a new file
String newPath=projectPath +"/extra/NewFile.txt";
FileOutputStream fileOS=new FileOutputStream(newPath);
proper.store(fileOS,"Musta is asking  a question");
}

	}