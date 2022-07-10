package Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
	System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	String url="https://powerlanguage.co.uk/wordle ";
	driver.get(url);
	Thread.sleep(2000);
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	if(currentURL.equals(url)) {
		System.out.println("URLs are the same");
	}	else {
		System.out.println("URLs are different");
			
		
	}
	System.out.println(driver.getTitle());
	driver.close();
	
	
	}
}
