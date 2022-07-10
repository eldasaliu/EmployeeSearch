package com.neotech.Lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// where is the file??
		String filePath = "\\Users\\Elda\\eclipse-workspace_b3\\JavaClassElda\\src\\example.properties";

		// lets read from the file
		FileInputStream fis = new FileInputStream(filePath);

		//
		Properties prop = new Properties();
		// if we do not load the data, and we write in the file, everything there will
		// be lost
		prop.load(fis);

		prop.setProperty("phoneNumber", "123456789");

		// to write to the file, we need a 'connection'
		FileOutputStream fos = new FileOutputStream(filePath);

		prop.store(fos, "we updated information");

	}

}