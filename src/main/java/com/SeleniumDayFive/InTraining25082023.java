package com.SeleniumDayFive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InTraining25082023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe"); 
		
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();  
		
		long start = System.currentTimeMillis();
		
		driver.get("https://www.google.com/"); 
		
		long finish = System.currentTimeMillis();
		
		long totalTime = finish - start;
		
		System.out.println("Total time for page load - " + totalTime);
		
	}

}
