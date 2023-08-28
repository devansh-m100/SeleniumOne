package com.SeleniumDayTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//browser setup
		WebDriverManager.chromedriver().setup();
		
		//This allows permissions for usage of Chrome Browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//To open web browser we require web driver object, its kind of a Constructor
		WebDriver driver = new ChromeDriver(co);
		
		//This Chrome version required is lesser version
		//So we gonna try Microsoft Edge.
		
	}

}
