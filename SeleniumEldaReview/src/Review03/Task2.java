package Review03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Task2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://the-internet.herokuapp.com/dynamic_controls
		// Click on Enable button
		// Wait for textbox to be enabled
		// When textbox is enabled, you can send some text there
setUp();

WebElement textbox=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
//System.out.println("'Visibile?"+textbox.isDisplayed());
//System.out.println("Enabled?"+textbox.isEnabled());

//textbox.sendKeys("Hi");
//clicking on the button
driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
//we cand do this way also
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-example\"]/button")));
FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);

fluentWait.withTimeout(Duration.ofSeconds(100));//Maximum 45 seconds
fluentWait.pollingEvery(Duration.ofSeconds(1));//Try every 10 second

//I need to wait until the textbox is clickebale
fluentWait.until(ExpectedConditions.elementToBeClickable(textbox));

System.out.println("-----After waiting ------");
System.out.println("'Visibile?"+textbox.isDisplayed());
System.out.println("Enabled?"+textbox.isEnabled());

textbox.sendKeys("Hi");
//System.out.println(textbox.getAttribute("value"));

Thread.sleep(2000);

	tearDown();
}}