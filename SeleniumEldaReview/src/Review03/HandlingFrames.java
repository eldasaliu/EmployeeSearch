package Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		//https://the-internet.herokuapp.com/iframe
		
		setUp();
		//1st way to switch the page by Index
		
		//driver.switchTo().frame(0);//if i dont switch is looking for the frame but its not finding
		
		//driver.findElement(By.id("tinymce")).clear();
		//Thread.sleep(2000);
//how about to delete the text thai is already there and put the text that we want
		//driver.findElement(By.id("tinymce")).sendKeys("Good Morning");
		
		Thread.sleep(2000);

		//2nd way to switch by iD or by Name
		//driver.switchTo().frame("mce_0_ifr");//if there are 2 frame with same name ,id it will chose whatever the first one is
	//driver.switchTo().frame(0);//if i dont switch is looking for the frame but its not finding
		
		//driver.findElement(By.id("tinymce")).clear();
		Thread.sleep(2000);
//how about to delete the text thai is already there and put the text that we want
		//driver.findElement(By.id("tinymce")).sendKeys("Good Morning");
		
		
		
		//3d way,Switching by webElement
		WebElement frameElement=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("tinymce")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("tinymce")).sendKeys("Good Morning");

		Thread.sleep(2000);
		
		//This will raise an execution, because the focus is insiide the frame
		//but the elemenet is outside of the frame
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		
		//we have to switch the focus to the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
	Thread.sleep(2000);	
	tearDown();
}
}
