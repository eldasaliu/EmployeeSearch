package Review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		////www.seleniumframework.com/Practiceform/

setUp();
//how do i get the id of the parent oage
String parentPageWindowId=driver.getWindowHandle();//this one will return id of all page that there are open since we have just one page we will get an error
//so we have to do getWindowHandle this will return the unique id
System.out.println(parentPageWindowId);
//the chrome browser has different and firefox has different but its unic id for both
driver.findElement(By.xpath("//a[@title='seleniumframework']")).click();
Thread.sleep(2000);
System.out.println("++++++++++++++++++++====");


//Not able to click.The focus is still on the firs page is i try to click on the link so i hav to iterate ,,switch the focus then to click the link
//driver.findElement(By.linkText("Choosing an Automation Solution")).click();

Set<String> allWindowsIds=driver.getWindowHandles();//This now will return all the unique Ids in a set
//this will return a set so a set will return only Unique and a List dublicates  now we gonna iterate
Iterator<String> iter=allWindowsIds.iterator();//we will get one by one 
while(iter.hasNext()) {
	String windowId=iter.next();
	System.out.println(windowId);
	if(!windowId.equalsIgnoreCase(parentPageWindowId)) {
//when i find the window which is not the parent window ! like this then switch that
		
		driver.switchTo().window(windowId);
			
	}
}

driver.findElement(By.linkText("Choosing an Automation Solution")).click();
Thread.sleep(2000);
	tearDown();
	
	}

}
