package com.neotech.Lesson25;

public class WebDriverTest {

	public static void main(String[] args) {

		ChromeDriver ch = new ChromeDriver();
		ch.takePicture();
		ch.closeBrowser();
		ch.openBrowser();
		ch.maximizerWindow();
		ch.findElement();

		System.out.println("----------------------");

		FirefoxDriver f = new FirefoxDriver();	
		f.takePicture();
		f.closeBrowser();
		f.openBrowser();
		f.maximizerWindow();
		f.findElement();
	
		

	}

}
