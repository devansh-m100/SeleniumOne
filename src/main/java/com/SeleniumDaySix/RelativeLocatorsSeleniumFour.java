package com.SeleniumDaySix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsSeleniumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.softwaretestingmaterial.com/");
		
		driver.manage().window().maximize();
		
		//Implicitly wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Relative locations left, right, near
		
		WebElement root = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_fe3c61-78\"]/div/div[2]/div/figure/a/img"));
		
		WebElement left = driver.findElement(with(By.tagName("img")).toLeftOf(root));
		
		System.out.println(left);
		
		WebElement right = driver.findElement(with(By.tagName("img")).toRightOf(root));

		System.out.println(right);
		
		WebElement near = driver.findElement(with(By.tagName("img")).near(root));
		
		System.out.println(near);
		
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		
		
		//WebElement right = driver.findElement(with(By.tagName("")))
	
	}

}
