package Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CheckBoxDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// Task until 2:30
		// Go to http://uitestpractice.com/Students/Form
		// Check Single
		// Select all the Hobbies
		// See if they are selected after you select each of them
setUp();

List<WebElement> radioList=driver.findElements(By.xpath("//input[@name='optradio']"));
radioList.get(1).click();
//same thing in 2 steps
//Get the second from the list and click on it
//WebElement el=radioList.get(1)
//el.click();
List<WebElement> checkBoxList=driver.findElements(By.xpath("//input[@type='checkbox']"));
//I want to check all of them one by one
for(WebElement checkBox:checkBoxList) {
	if(checkBox.isSelected()) {
		System.out.println("It is  selected");	
		
	}else {
		System.out.println("It is not selected");
	}
	checkBox.click();
	if(checkBox.isSelected()) {
		System.out.println("It is  selected");	
		
	}else {
		System.out.println("It is not selected");
}
	Thread.sleep(2000);
	
tearDown();


}	
	}
}
