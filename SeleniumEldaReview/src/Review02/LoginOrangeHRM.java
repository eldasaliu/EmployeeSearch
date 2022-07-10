package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class LoginOrangeHRM extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Neotech@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement logo=driver.findElement(By.xpath("//span[@id='account-name']"));
		
		if(logo.isDisplayed()) {
			System.out.println("The logo with text " + logo.getText()+ " is displayed");
			
		}else {
			System.out.println("The logo is not displayed");
		}
		Thread.sleep(2000);
		driver.quit();
		
		tearDown();

	}

}

