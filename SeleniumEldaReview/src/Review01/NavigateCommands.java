package Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.nytimes.com/";
		driver.navigate().to(url);
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String foxNnews="https://www.foxnews.com/";//also without www it can work
		driver.navigate().to(foxNnews);
		Thread.sleep(2000);
		String russianNews="https://www.rt.com/";
		driver.navigate().to(russianNews);
		Thread.sleep(2000);
		driver.navigate().back();//this will go back to the previews page(second page)
		Thread.sleep(2000);
		driver.navigate().back();//this will go back to the first page)
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
