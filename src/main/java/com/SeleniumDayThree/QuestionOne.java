package com.SeleniumDayThree;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuestionOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//setting up driver
		WebDriverManager.edgedriver().setup();
				
		//creating driver object for WebDriver class (driver is mapped with edge browser) by this simply browser gets opened. EdgeDriver() is the constructor
		WebDriver driver = new EdgeDriver();
		
		//opening a web page using get() method 
		driver.get("https://www.flipkart.com/");
		
		//title retrieve using .title
		String str = driver.getTitle();
		System.out.println(str);
		
		//String length
		int l = str.length();
		
		System.out.println(l);
		
		//Get Page URL & verify if it is correct page opened
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		//search mobile
		
		driver.findElement(By.name("q")).sendKeys("Mobile", Keys.ENTER);
		
		Thread.sleep(3000);
		
		//Samsung checkbox
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]")).click();
		Thread.sleep(3000);
		
		//Display all the titles of the mobiles
		
		List <WebElement> data = driver.findElements(By.className("_4rR01T"));
		
		for(WebElement iter1 : data) {
			System.out.println(iter1.getText());
		}
		
	}

}
