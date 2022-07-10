package com.neotech.Lesson26;

interface WebDriver {
	public void open();

	public void close();

	public String getTitle();

}

interface TakeScreenshot {
	public void getScrenshot();
}

interface RemoteWebDriver extends WebDriver, TakeScreenshot {
	public void navigate();

}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver is open");
	}

	@Override
	public void close() {
		System.out.println("Chrome driver is close");
	}

	@Override
	public String getTitle() {

		return "Chromebriver";
	}

	@Override
	public void getScrenshot() {
		System.out.println("Screenshot from Chrome ");
	}

	@Override
	public void navigate() {
		System.out.println("Chrome driver navigates");

	}

}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Fire fox driver is open");

	}

	@Override
	public void close() {
		System.out.println("Fire fox driver is close");

	}

	@Override
	public String getTitle() {
		return "Fire Fox";
	}

	@Override
	public void getScrenshot() {
		System.out.println("Screenshot from Fire fox  ");

	}

	@Override
	public void navigate() {
		System.out.println("Fire fox driver navigates");

	}

}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver is open");

	}

	@Override
	public void close() {
		System.out.println("Safari driver is close");

	}

	@Override
	public String getTitle() {

		return "Safari";
	}

	@Override
	public void getScrenshot() {
		System.out.println("Screenshot from Safari  ");

	}

	@Override
	public void navigate() {
		System.out.println("Safari driver navigates");

	}
}