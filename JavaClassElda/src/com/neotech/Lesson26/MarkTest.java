package com.neotech.Lesson26;

import com.neotech.Lesson25.Camera;
import com.neotech.Lesson25.ChromeDriver;
import com.neotech.Lesson25.FirefoxDriver;
import com.neotech.Lesson25.WebDriver;

public class MarkTest {

	public static void main(String[] args) {
StudentA st1=new StrudentA(78,96,88);
StrudentB st2=new StrudentB(55,89,98,99);

System.out.println(st1.getAverage());
System.out.println(st2.getAverage());
	}

}
//
//public interface WebDriver {
//	
//	//these methods are all abstract
//void openBrowser ();
//void closeBrowser();
//void maximizerWindow();
//void findElement();
//
//}
//interface Camera{
//	//abstract by default
//	void takePicture();
//	
//}
//class ChromeDriver implements WebDriver,Camera {
//	
//	String driver="ChromeDriver";
//
//	@Override
//	public void takePicture() {
//		 System.out.println("Take a picture using"+ driver);
//		
//	}
//
//	@Override
//	public void openBrowser() {
//	 System.out.println("Open the browser using"+driver);
//		
//	}
//
//	@Override
//	public void closeBrowser() {
//      System.out.println("Close the browser using"+driver);		
//	}
//
//	@Override
//	public void maximizerWindow() {
//		System.out.println("Maximizing window using "+driver);
//		
//	}
//
//	@Override
//	public void findElement() {
//     System.out.println("Find element using"+driver);		
//	}
//}
//	class FirefoxDriver implements WebDriver,Camera{
//String driver="FirefoxDriver";
//		@Override
//		public void takePicture() {
//System.out.println("Take a picture using"+ driver);			
//		}
//
//		@Override
//		public void openBrowser() {
//System.out.println("Open the browser using"+driver);			
//		}
//
//		@Override
//		public void closeBrowser() {
//		      System.out.println("Close the browser using"+driver);		
//			
//		}
//
//		@Override
//		public void maximizerWindow() {
//			System.out.println("Maximizing window using "+driver);
//			
//		}
//
//		@Override
//		public void findElement() {
//			System.out.println("Find element using"+driver);			
//		}
//		
//	}
//	
//	public class WebDriverTest {

//public static void main(String[] args) {
////WebDriver chrome=new WebDriver();
////for abstract,interface we cannot create object always with casting if we want
//ChromeDriver chrome=new ChromeDriver();//in this way we can create object
//chrome.openBrowser();
//chrome.maximizerWindow();
//chrome.findElement();
//chrome.takePicture();
//chrome.closeBrowser();
//
//
//
//
//System.out.println("----------------------");
//
//FirefoxDriver f= new FirefoxDriver ();
//f.openBrowser();
//f.maximizerWindow();
//f.findElement();
//f.takePicture();
//f.closeBrowser();
//
//System.out.println("___=--------------");
//
//WebDriver wb=new ChromeDriver();
////wb.takePicture(); cannot access takePicture();its not such a method
////1.we loose access to methods: we don't
////2. dealing with multiple different objects
