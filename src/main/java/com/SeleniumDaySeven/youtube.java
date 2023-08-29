package com.SeleniumDaySeven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Harshad", Keys.ENTER);
		
		
	}

}
