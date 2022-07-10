package Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HarryPotterSearch extends BaseClass{
	// Task and break until 1:20
	// Go to https://amazon.com
	// select books from the search dropdown
	// type Harry potter
	// and click on Search
	// check "Kindle Unlimited Eligible" checkbox on the left
	public static void main(String[] args) throws InterruptedException {
setUp();
WebElement searchDDElement=driver.findElement(By.id("searchDropdownBox"));
Select selectDD =new Select(searchDDElement);

//print all the options of the drop down
//
//List<WebElement>optionList=selectDD.getOptions();
//for(WebElement option:optionList) {
//	System.out.println(option.getText());
//3 ways to select the drop down item
//1//selectDD.selectByIndex(1);
//2//selectDD.selectByValue("search-alias=baby-products");
//3
selectDD.selectByVisibleText("Books");

WebElement searchTxt=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
searchTxt.sendKeys("Brian Potter");
Thread.sleep(2000);
searchTxt.clear();
searchTxt.sendKeys("Harry Potter");
Thread.sleep(2000);

WebElement searchBtn=driver.findElement(By.xpath("//span[@id='nav-search-submit-text"));
	searchBtn.submit();
	Thread.sleep(2000);
	//findElement vs findElements
	//findElement return the first WebElement with that xpath
	//findEement returns all the WebElements with tha xpath inside a List
	
	
	//Interview question
	//What the difference find element and find elements(this return a list)

	
	//WebElement element =driver.findElement(By.xpath("//li[@class='a-spacing-micro']"));
	//element.click();
	//i want to find all the element not to click only in one we create a lit
	
	List<WebElement> elementList=driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
	System.out.println("There are :" + elementList.size() +": with that xPath");
	
	//Interviw question what exception have you seen 
	//This exception is a nightmare for testers 'StaleElementReferenceException'
	//Happens when we click and dont break the loop//the error in console
	
	
	for (WebElement el:elementList) {
		String elementText=el.getText();
		if(elementText.equals("Kindle Unlimited Eligible")) {
			el.click();
			break;
		}
	}
	
Thread.sleep(2000);
tearDown();

}
	}


