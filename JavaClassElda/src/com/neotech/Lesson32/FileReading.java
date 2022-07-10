package com.neotech.Lesson32;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {

		//get path
		String filePath = "/Users/sabah/eclipse-workspace_b3/JavaBasic3/configs/example.properties";
		System.out.println(filePath);
		
		//find user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		//find username
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		//this is wrong :))))
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		
		//we can build a dynamic path 
		
		String dynamicFilePath = System.getProperty("user.dir") + "/configs/conf.properties";
		System.out.println(dynamicFilePath);
		
		FileInputStream fis = new FileInputStream(dynamicFilePath);
		
		//create a Properties object
		Properties prop = new Properties();
		//load data from file
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		
		//or, another way
		
		System.out.println(prop.getProperty("url"));
		
		
		
		

	}

}

}
