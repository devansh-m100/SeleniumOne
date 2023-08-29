package com.SeleniumDaySeven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("");
				
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);  
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath(""))
				WebElement datepick = driver.findElement(By.xpath("//input[@id = 'datepicker1']"));
				
				datepick.click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('value', '04/10/2023')", datepick);
				
				driver.quit();
				
	}

}
