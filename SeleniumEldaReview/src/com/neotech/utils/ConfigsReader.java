package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
////Configs reader is to read this properties file conf.properties
//	private static Properties prop;//this is an instance variable it can be seen form the methods but still i have to make static so it can be seen but i have to make private
//	
//	/**
//	 * This method will read the properties file this is what developers do
//	 * @param filepath
//	 */
//	public static void readProperties(String filepath) {
//		
//		//if i want to read a file i will use
//		try {
//			FileInputStream fileIS=new FileInputStream(filepath);
//			prop=new Properties();
//			prop.load(fileIS);//inputstream help us read the specific file it will load in the specific map
//			fileIS.close();
//			
//		} catch (FileNotFoundException e) {
//System.out.println("The file path is wrong");
//
//		} catch (IOException e) {
//		System.out.println("I couldn't read the file");
//		
//		}
//		
//	}
//	/**
//	 * This method willl return a value for a specific key
//	 * @param String key
//	 * @return String value
//	 */
//public static String getProperty(String key) {//if i want to use this it will say give me a key
//
//		return prop.getProperty(key);
//	}
//}

	private static Properties prop;

	/**
	 * This method with read the properties file
	 * 
	 * @param filePath
	 */
	public static void readProperties(String filePath) {

		try {
			FileInputStream fileIS = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fileIS);
			fileIS.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file path is wrong!");
		} catch (IOException e) {
			System.out.println("I couldn't read the file!");
		}

	}

	/**
	 * This method will return a value for a specific key
	 * 
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
