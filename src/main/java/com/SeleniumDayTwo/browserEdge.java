package com.SeleniumDayTwo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserEdge {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//setting up driver
		WebDriverManager.edgedriver().setup();
		
		//creating driver object for WebDriver class (driver is mapped with edge browser) by this simply browser gets opened. EdgeDriver() is the constructor
		WebDriver driver = new EdgeDriver();
		
		
		//opening a web page using get() method 
		driver.get("http://apple.com");
		
		
		//to automatically open the edge window in full screen
		//driver.manage().window().maximize();
		
		//It automatically opens the website in the same window of the edge browser
		driver.get("http://google.com");
		/*
		//Now we gonna use the navigation buttons of the browser website we open
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//So as to slower the animation that happens automatically, this is in milliseconds.
		Thread.sleep(3000);
		*/
		
		
		//title retrieve using .title
		String str = driver.getTitle();
		System.out.println(str);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		System.out.println(pageSource.length());
		
		//Closes currently using tab
		//driver.close();
		
		//Closes all windows totally
		//driver.quit();
		
		//Gets current tab ID output like - 3B447B3DAA9A93BB1A141D6AF75BB81B
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		/*
		//getWindowHandles() is similar other method which returns Set of Strings
		Set <String> handles = driver.getWindowHandles();
		for (String h : handles) {
			System.out.println(h);
			
		}
		*/
		
		Set <String> handles = driver.getWindowHandles();
		for (String n : handles) {
			System.out.println(driver.switchTo().window(n));
			System.out.println(driver.getWindowHandle());
		}
	}
	
	
}
