package Review03;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExceplicitWaitDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	//	https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html
		
		
/////////////////////////////////WebDriverWait is extending the fluent wait
		
	setUp();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); is for all element
	
	WebElement startDownload= driver.findElement(By.id("downloandButton"));
	startDownload.click();
	Thread.sleep(1000);
	//This line will raise an exception NoSuchElementException
	//because the element is not visible yet
	//driver.findElement(By.xpath("//div[text()='Complete!']"));
	
	//I want to wait until the Complete label is visible
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
	//wait until the element is visible
	//wait for a maximum of 60 seconds
	//WebElement statusComplete=driver.findElement(By.xpath("//div[text()='Complete!']"));
	//System.out.println("The text is->" +statusComplete.getText());
	//
	//
	////////////////////FluentWait the difference between webDriver and this is that you specified the time withTimeOut and PollingEvery
	
	
	FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
	
	fluentWait.withTimeout(Duration.ofSeconds(45));//Maximum 45 seconds
	fluentWait.pollingEvery(Duration.ofSeconds(10));//Try every 10 second
	fluentWait.ignoring(NoSuchElementException.class);//While trying ignore this exception
	fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/button[text()='Close']")));
	WebElement closeButton=driver.findElement(By.xpath("/button[text()='Close']"));
	closeButton.click();
	Thread.sleep(2000);
	tearDown();
	
		
		
}
	}
