package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	//this is an instance veriable now //private variable because we dont want to get acsess from autside //this is anxatulaction now and we use in the configs
	private static Properties prop;//this can be here or in the bottom //this is king Setter method we are reading the properties npw we need kind of getter
	/**
	 * This method will read the properties file
	 * @param filepath
	 *///This method will read the properties file (block comment) 
public static void readProperties(String filepath)   {
//this is king Setter method we are reading the properties npw we need kind of getter
	
	try {
		FileInputStream fis=new FileInputStream (filepath);
		prop=new Properties();
		prop.load(fis);
		fis.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
/**
 * This method will return the value fo a specific key
 * @param key
 * @return
 */

public static String getProperty(String key) {
	return prop.getProperty(key);
}
}
