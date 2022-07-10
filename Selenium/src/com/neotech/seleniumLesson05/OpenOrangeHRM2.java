package com.neotech.seleniumLesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.util.ConfigsReader;
import com.neotech.util.Constants;

public class OpenOrangeHRM2 {// less steps this time

	public static void main(String[] args) throws InterruptedException {
//this will import configsReader
		// this line will read the configuration.properties file
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);// this will import constats
		WebDriver driver = null;
		// if the value of the browser is chrome we will initilize this
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {// because if it is chrome with lower case or with
																		// uper case will help and work {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		}
		String website=ConfigsReader.getProperty("url");
		
		driver.get(website);
		String title=driver.getTitle();
		System.out.println("title -->" + title);
		Thread.sleep(5000);
		driver.quit();
	}

}
