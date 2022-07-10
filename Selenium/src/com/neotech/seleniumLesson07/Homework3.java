package com.neotech.seleniumLesson07;

import org.openqa.selenium.By;

import com.neotech.util.BaseClass;

public class Homework3 extends BaseClass{
//	Open chrome browser
//    Go to "https://semantic-ui.com/modules/dropdown.html"
//    Scroll down to "Multiple Selection"
//    Click on drop down and select "CSS" and "HTML"
//    Verify value has been selected
//    Deselect 1 of the options from the dropdown
//    Quit browser

	public static void main(String[] args) throws InterruptedException {
setUp();

Thread.sleep(2000);

//I have to click so that drop-down options will show
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div")).click();
Thread.sleep(2000);
//click on CSS option
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]")).click();
Thread.sleep(2000);
//click on HTML option
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]")).click();
Thread.sleep(2000);
//Removing CSS
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[text()='CSS']/i")).click();
Thread.sleep(2000);
//Removing HTM
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[text()='HTML']/i")).click();
Thread.sleep(2000);
tearDown();


	}

}
