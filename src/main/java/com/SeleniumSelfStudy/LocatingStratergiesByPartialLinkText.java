package com.SeleniumSelfStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * Let us consider a test case in which we will automate the following scenarios:

	Invoke Chrome browser
	Open URL: https://www.testandquiz.com/selenium/testing.html
	Click on the link text "This is a Link" on the sample web page
 */

public class LocatingStratergiesByPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}

}
