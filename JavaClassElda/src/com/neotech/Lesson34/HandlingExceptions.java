package com.neotech.Lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingExceptions {

	public static void main(String[] args) {
try {
	Thread.sleep(2000);
	
}
catch(InterruptedException e) {
	
	
}
System.out.println("Caught InterruptedException");
	
System.out.println("Countinues with other code");
String path=" ";
try {
	FileInputStream fis=new FileInputStream(path);
	
}catch(FileNotFoundException e) {
	System.out.println("Caught a FileNotFoundException");
	
}

System.out.println("Lets add another try catch block");
int a =5;
int b=0;

	}
	

}


