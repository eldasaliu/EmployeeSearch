package com.neotech.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;
//
public class BaseClass {//THIS WILL BE EXECUTED ONE TIME IN THE BEGGINING
	
	
	public static WebDriver driver;// non static method

	/**
	 * This method will create the driver and open the browser
	 */
	

	public static void setUp() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {// because if it is chrome with lower case or with
		// uper case will help and work {
		case "chrome":

//System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
//we dont need this because of Boni garcia downlod we switch to this now
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			break;
		case "firefox":

			// System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
		PageInitializer.initialize();
	}

	/**
	 * This method will close the browser
	 */
	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
