package com.SeleniumDayEight;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.xpath("//input[@id = 'user_full_name']")).sendKeys("username");
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 
		
	}

}
