package com.neotech.Lesson34;

import java.io.FileInputStream;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
String filePath=System.getProperty("user.dir") +"\\Users\\Elda\\eclipse-workspace_b3\\JavaClassElda\\src\\example.properties";
try {
	FileInputStream fis=new FileInputStream(filePath);
	Properties prop=new Properties();
	prop.load(fis);
}catch(FileNotFoundException fnfe) fis=new FileInputStream(filePath);//FileNotFoundException



	}

}
