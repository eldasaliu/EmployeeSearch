package com.neotech.seleniumLesson05;

import com.neotech.util.BaseClass;

public class OpenOrangeHRM3  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//this line will open the browser and 
setUp();
//here we are doing our test case
String title=driver.getTitle();
System.out.println("title-->" + title);
Thread.sleep(2000);
//this line will quit the browser
tearDown();
	}

}
