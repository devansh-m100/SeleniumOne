package com.SeleniumDayFive;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		driver.manage().window().maximize();
		
		//Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
	}

}
