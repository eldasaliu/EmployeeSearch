package com.neotech.seleniumLesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class NestedFrames extends BaseClass {



			public static void main(String[] args) throws InterruptedException {
		setUp();
		//switch to the frame using ID
		driver.switchTo().frame("frame1");
		//Let Us locate the child frame
		WebElement childFrame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		//let us switch  to child frame
		driver.switchTo().frame(childFrame);
		//Now we are searching inside the child frame
		WebElement p=driver.findElement(By.xpath("//body/p"));
		System.out.println("The text inside the child frame->" +p.getText());
		Thread.sleep(2000);
		// At this point the focus is inside the child frame
		// If wee try to find anything in the main page
		// We will get an error

		// Will switch the focus to the main page
		driver.switchTo().defaultContent();
		tearDown();
	}

}
