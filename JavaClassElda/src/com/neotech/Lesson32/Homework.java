package com.neotech.Lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Homework {

	public static void main(String[] args) throws IOException {
//		Homework 1:
//		    Create a PROPERTY file to store following configurations:
//		        browser=
//		        url=
//		        username=
//		        password=

		
		String filePath="\\Users\\Elda\\eclipse-workspace_b3\\JavaClassElda\\src\\example.properties1";
		FileInputStream Input=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(Input);
		
		Set<Object> keys=prop.keySet();
		Collection<Object>values=prop.values();
		
		for(Object key:keys) {
			System.out.println(key);
		}
		for(Object value:values) {
			System.out.println(value);
	}

}
}
