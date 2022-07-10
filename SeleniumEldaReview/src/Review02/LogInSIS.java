package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class LogInSIS extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		//we are doing ou test
		Thread.sleep(2000);
		//sending text in two steps
		WebElement username=driver.findElement(By.id("tUsername"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		//sending text in one step
		driver.findElement(By.name("tPassword")).sendKeys("Neotech$123");
		Thread.sleep(2000);
		//submit works better than click in forms
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		tearDown();
		
	}

}
