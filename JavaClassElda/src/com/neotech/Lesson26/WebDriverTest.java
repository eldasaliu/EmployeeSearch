package com.neotech.Lesson26;

public class WebDriverTest {

	public static void main(String[] args) {

		ChromeDriver c = new ChromeDriver();

		c.open();
		c.close();
		c.getTitle();
		c.getScrenshot();
		c.navigate();

		System.out.println();

		FirefoxDriver f = new FirefoxDriver();
		f.close();
		f.getTitle();
		f.getScrenshot();
		f.navigate();
		f.navigate();
		System.out.println();

		SafariDriver s = new SafariDriver();

		s.close();
		s.getTitle();
		s.getScrenshot();
		s.navigate();
		s.navigate();

	}
}
