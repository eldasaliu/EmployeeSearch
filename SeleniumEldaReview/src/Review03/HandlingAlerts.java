package Review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HandlingAlerts extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		//http://www.seleniumframework.com/Practiceform/
			
			
		setUp();
	WebElement alertButton=	driver.findElement(By.id("alert"));
	alertButton.click();//if i want to do more things after i can use this method
	
	
	//driver.findElement(By.id("alert")).click();
		Thread.sleep(2000);
		
		//handle the alert
		Alert alert =driver.switchTo().alert();
		
		String alertText=alert.getText();
		System.out.println("The text of the alert is->" + alertText);
//i can also accept the alert will close the alert
		alert.accept();
		Thread.sleep(500);
		//Handling the timing alert
		
		driver.findElement(By.id("timingAlert")).click();
		//in here it takes time for the alert to oper so i want to eait for the alert to open so 10 sec i am going tp wait
		
		//This kind of waiting is not good so its to much wait thats why we are getting error
		//Thread.sleep(500);//if we dont put this Thread it is going to show error so we need this
		//no alert present exception 
		
		//This is flexible
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//or less second so we have to see how much longer takes fo the alert to pop up
		//i want to wait for maximum 30 second until the element is enable ,clickebale
		wait.until(ExpectedConditions.alertIsPresent());
		//if the alert is present in 3 sec we wait only 3 sec
		
	 alert=driver.switchTo().alert();
	 String alertText2=alert.getText();
		System.out.println("The text of the alert is->" + alertText2);

		alert.accept();
		
		//The waiting time varies with web speed 
		//implicity wait is for all the element in the page
		//
			tearDown();
	}

}
