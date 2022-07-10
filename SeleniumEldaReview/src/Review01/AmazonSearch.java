package Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="https://www.amazon.com/";
		driver.get(url);
		//There are 8 locators to find the elements in the Dom
		//id,name,classname,linkText,patialLinkText,tagName,xpath,cssSelector
WebElement searchText=driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']"));
	searchText.sendKeys("books");
	WebElement searchButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
	searchText.click();
	Thread.sleep(5000);
	driver.quit();
	
}
}