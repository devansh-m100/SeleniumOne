package com.SeleniumDaySeven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectInDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//main point is getAllSelectedOptions() method that stores 
		
		//driver.findElement(By.xpath(""))
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		
	    jss.executeScript("window.scrollBy(0, 600)", "");
	    
	    
	    
	}

}
