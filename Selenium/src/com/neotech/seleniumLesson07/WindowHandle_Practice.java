package com.neotech.seleniumLesson07;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.util.BaseClass;

public class WindowHandle_Practice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
setUp();

System.out.println("The title of the main page " +driver.getTitle());
String mainPageId=driver.getWindowHandle();
System.out.println("The main page Id is" +mainPageId);
Thread.sleep(2000);
driver.findElement(By.id("tabBbutton")).click();//2nd page
driver.findElement(By.id("windowButton")).click();//3d page
//click on the messageWindowButton
driver.findElement(By.id("messageWindowButton")).click();//4th page
Set<String> allWindowHandles=driver.getWindowHandles();
System.out.println("The size of all the openned windows_>"+allWindowHandles.size());
for(String handle:allWindowHandles) {
	if(!handle.equals(mainPageId))
{
		//switch to the page
		driver.switchTo().window(handle);
		//close the page
		driver.close();
		
		
}
}
Thread.sleep(2000);
tearDown();

	}

}
