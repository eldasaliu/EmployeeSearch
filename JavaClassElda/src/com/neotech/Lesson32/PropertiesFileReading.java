package com.neotech.Lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
//How do we read a file (Properties)??
		//1. we need to have the file located?
		String filePath="\\Users\\Elda\\eclipse-workspace_b3\\JavaClassElda\\src\\example.properties";
		
	//2. create an object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
	//3.to handle.properties files we will need to use Properties java class
		Properties prop=new Properties();
	//4. load everything in your .properties file with load() method	
	prop.load(fileInput);
	String name=prop.getProperty("name");
	System.out.println(name);
	//keys are case senitive
	String lastName=prop.getProperty("lastName");
		System.out.println(lastName);
		
		Set<Object> keys=prop.keySet();
		Collection<Object>values=prop.values();
		
		for(Object key:keys) {
			System.out.println(key);
			
		}
		for (Object value : values)
		{
			System.out.println(value);
		}
	}

}
