package com.neotech.Lesson35;

public class LoadBrowser {

	public static void main(String[] args) {
	
		
		getBrowser("chrome");
		System.out.println("All other tasks begin here");
	}
	public static void getBrowser(String browser) {
		switch(browser) {
		case "chrome":
		System.out.println("you are loading the chrome driver");
		break;
		case "firefox":

	System.out.println("You are loading the Chrome driver");}
break;
default:
throw new RuntimeException("Driver does not exist!!!");

	}
}
