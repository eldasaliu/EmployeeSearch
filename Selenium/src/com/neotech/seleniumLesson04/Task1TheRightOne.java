package com.neotech.seleniumLesson04;

public class Task1TheRightOne {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	​
	public class Task1TheRightOne {
	​
		public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		
		public static String username = "Tester";
		public static String password = "test";
		
		public static void main(String[] args) throws InterruptedException {
	​
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			//we send username and password
			driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
			driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
	​
			driver.findElement(By.id("ctl00_MainContent_login_button")).click();
			
			
			//check if logo is displayed
			WebElement logo = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
			
			if(logo.isDisplayed())
			{
				System.out.println("The logo with text " + logo.getText() + " is displayed");
			}
			else
			{
				System.out.println("The logo is not displayed!");
			}
			
			Thread.sleep(2000);
			driver.quit();
			
			tearDown();
			
			
			
			
		}

		private static void tearDown() {
			// TODO Auto-generated method stub
			
		}
	​
	

