package com.SeleniumDayFour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InTraining2482023One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting up Selenium, Browser Automation Testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
				
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com/");
		
		WebDriver driver1 = new ChromeDriver(co);
		
		driver1.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a/span")).click();
		
		driver1.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a/span")).click();
		
	}

}
