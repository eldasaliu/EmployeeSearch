package Review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {
//https://nxtna
	public static void main(String[] args) throws InterruptedException {
setUp();
//when alert is open you cannot interact with the main page
driver.findElement(By.xpath("confirmalertbox")).click();
Alert confirmAlert=driver.switchTo().alert();
System.err.println("The confirm text is ->" +confirmAlert.getText());
//confirmAlert.dismiss();
Thread.sleep(2000);


//After accept of dismiss we can interact with the main page
driver.findElement(By.name("promptalertbox1234")).click();
Alert promtAlert=driver.switchTo().alert();
Thread.sleep(2000);
promtAlert.sendKeys("Yes");
promtAlert.accept();
Thread.sleep(2000);



tearDown();

}

}
