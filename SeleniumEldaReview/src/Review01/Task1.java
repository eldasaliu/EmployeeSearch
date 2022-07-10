package Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome browser
		// Navigate to https://www.selenium.dev/
		// Navigate to https://www.amazon.com/
		// Go back and forth 10 times.
		// Use a for loop
		// Wait 1 second between each navigation
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="https://www.selenium.dev/";
		driver.navigate().to(url);//if i use get i am not able to go back 
		Thread.sleep(1000);
		
		String amazon="https://www.amazon.com/";
		driver.navigate().to(amazon);
		Thread.sleep(1000);
		for(int i=0;i<10;i++) {
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.quit();
			
		}
		
	}

}
