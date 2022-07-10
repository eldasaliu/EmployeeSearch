package com.neotech.seleniumLesson07;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import com.neotech.util.BaseClass;

public class WindowHandle_Demo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		System.out.println("Title->" + driver.getTitle());
//This will give a unique ID of the window/tab

		System.out.println("Title->" + driver.getWindowHandle());
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
//This will give the unique IDs of all open windows,it will returned in a set of string
		Set<String> allWindowsHandles = driver.getWindowHandles();

		System.out.println("The number of open windows is->" + allWindowsHandles.size());
		Iterator<String> it = allWindowsHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		System.out.println("Window1" + window1);
		System.out.println("Window2" + window2);
//Switching the window's focus using unique code/handle
		driver.switchTo().window(window2);
//get the title of the focusec window/tab
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(2000);
//This will close only the focused window/tab
//driver.close(); 

		Thread.sleep(2000);

		driver.switchTo().window(window1);
		Thread.sleep(2000);
		driver.switchTo().window(window2);
		Thread.sleep(2000);
		driver.switchTo().window(window1);
		Thread.sleep(2000);
		driver.switchTo().window(window2);
		Thread.sleep(2000);
	}

}
