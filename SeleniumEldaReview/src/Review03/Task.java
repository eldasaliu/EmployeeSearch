package Review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// // Task until 12:45
		// Open http://www.seleniumframework.com/Practiceform/
		// Click on the link that opens a new window
		// Switch the focus back and forth 5 times
		// Hint: You switch the two handles that you have in the set

		setUp();
		driver.findElement(By.xpath("//a[@title='seleniumframework']")).click();
		
		//Now we have to windows open
		Set<String> allWindows=driver.getWindowHandles();
		
		
		
	//also we can do with enhanced for loop,while
		
		
		
		//but not with a for loop because a set doesnt have index
		
		
		//now i want to iterate and switch
		Iterator<String> iter=allWindows.iterator();
		String window1 = iter.next();//iterator of the first one
		String window2 = iter.next();

		System.out.println("window1 -> " + window1);
		System.out.println("window2 -> " + window2);
		for(int i=0;i<5;i++) {
			driver.switchTo().window(window1);
			Thread.sleep(2000);
			driver.switchTo().window(window2);
			Thread.sleep(2000);
			
		}
		Thread.sleep(2000);
		
		driver.close();//will close only the current window/tab
		driver.quit();//will close all the open windows/tabs
		tearDown();//here we are using driver.quit();
		
		
	}

}
