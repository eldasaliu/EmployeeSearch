package com.neotech.Lesson25;
//Homework 1:

//    Create a WebDriver Interface that will have the following unimplemented behaviour: 
//	   openBrowser(), 
//	   closeBrowser(), 
//	   maximizeWindow(), 
//	   findElement(). 
//
//    Create another interface named Camera that will have the method:
//	   takePicture();
//    Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.

public interface WebDriver {

	void openBrowser();

	void closeBrowser();

	void maximizerWindow();

	void findElement();

}

interface Camera {
	// abstract by default
	void takePicture();

}

class ChromeDriver implements WebDriver, Camera {

	@Override
	public void takePicture() {
		System.out.println("Camera takes picture");

	}

	@Override
	public void openBrowser() {
		System.out.println("Open the Chrome browser ");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close the Chrome browser ");
	}

	@Override
	public void maximizerWindow() {
		System.out.println("Maximizing Chrome window  ");

	}

	@Override
	public void findElement() {
		System.out.println("Find element in the Chrome window ");
	}
}

class FirefoxDriver implements WebDriver, Camera {

	@Override
	public void takePicture() {
		System.out.println("Camera takes  picture ");
	}

	@Override
	public void openBrowser() {
		System.out.println("Open the Firefox browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close the Firefox browser ");

	}

	@Override
	public void maximizerWindow() {
		System.out.println("Maximizing Firefox window ");

	}

	@Override
	public void findElement() {
		System.out.println("Find element in the Firefox window");
	}

}
