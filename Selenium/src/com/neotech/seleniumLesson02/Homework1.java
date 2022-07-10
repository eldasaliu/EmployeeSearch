package com.neotech.seleniumLesson02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1:
//Open chrome browser
//Go to “http://demo.guru99.com/test/newtours/”
//Click on Register Link
//Fill out ALL required info
//Click Submit
//User successfully registered
//(Create the script using different locators)
public class Homework1 {
	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("REGISTER")).click();
		Thread.sleep(5000);

		driver.findElement(By.name("firstName")).sendKeys("Elda");
		driver.findElement(By.name("lastName")).sendKeys("Saliu");
		driver.findElement(By.name("phone")).sendKeys("878423731");
		driver.findElement(By.id("userName")).sendKeys("eldam4@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("458 Wayne");
		driver.findElement(By.name("city")).sendKeys("Wayne");
		driver.findElement(By.name("state")).sendKeys("NJ");
		driver.findElement(By.name("postalCode")).sendKeys("0785");
		driver.findElement(By.id("email")).sendKeys("eldam4@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Elda12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("Elda12345");

		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);
		String URL = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String currentURL = driver.getCurrentUrl();

		if (URL.equals(currentURL)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}

		driver.quit();

	}
}
