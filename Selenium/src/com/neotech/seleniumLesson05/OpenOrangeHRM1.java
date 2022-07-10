package com.neotech.seleniumLesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOrangeHRM1 {

	public static void main(String[] args) throws IOException, InterruptedException {//we can throw multiplie exeption
		//Task
        //open Chrome browser
		// Navigate to https://hrm.neotechacademy.com/
		//Print the title of the page
		//close the browser
		
		
		//why do we use this one ,,we read the configuration file
		String filepath=System.getProperty("user.dir")+ "/configs/configuration.properties";
		//System.out.println(filepath);
		FileInputStream fis=new FileInputStream(filepath);
		
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop);
		
		//Starting with Selenium classes and methods
		
		WebDriver driver =null;//polymorphisem//if we are not decided wich one we open
		
		if(prop.getProperty("browser").equals("chrome")) {
			//System.out.println("open chrome browser");
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}else if (prop.getProperty("browser").equals("firefox")) {
			//System.out.println("Open firefox browser");
			//open firefox browser
			System.setProperty("webdriver.gecko.driver", "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		String website=prop.getProperty("url");
		driver.get(website);
		
		
		String title=driver.getTitle();
		System.out.println("title -->" + title);
		Thread.sleep(5000);
		driver.quit();
		
		//if we want to test with firefox we got to configs file (broswer) and change from chrome to firefox
		
		
	}
	
	

}
