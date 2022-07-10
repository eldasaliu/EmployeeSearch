package com.neotech.seleniumLesson08;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;

import com.neotech.util.BaseClass;

public class Homework1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
//		HW_1_Handling Multiple Windows =======================
//
//	1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed.Switch to the parent window.
// 6) Quit all browsers
		
		setUp();
		
		driver.findElement(By.linkText("Click here")).click();
		//There's a couple ways you can do it but the way 
		//I did was a custom xpath. //a[@href='../articles_popup.php']
		//a new window will open after will cklick
		
		
		//we need to shift the focus of the driver to the new window
		
		
		         //part 1                //part2
		Set<String> windowHandles=driver.getWindowHandles();
		
		//now we iterate
		
		Iterator<String> it=windowHandles.iterator();
		
		String parentWeb=it.next();
		String childWeb=it.next();
		//we can do it with the List also and we also can iiterate ith for loop or enhanced
		
		//move the focus of the driver to the childweb
		driver.switchTo().window(childWeb);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("eldasaliu@gmail.com");
		//click on submit button
		driver.findElement(By.xpath("//input[@name='emailid']")).click();
		
		//we can build a relative xpath://tr[4]/td[2][@align='center']
		String username=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		//we can build relative xpath://tr[5]/td[2][@align='center']
	String password = driver.findElement(By.xpath("//tr[5]/td[2][@align='center']")).getText();
		
		
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
	
		//how can we get back at the parent window:
		//1. we can leave this open and use switchTo()
		//2. we can close this tab and automatically the focus will shift to the previous window.
		
		driver.close();
		
		Thread.sleep(3000);
				
				
		tearDown();
	}

}
