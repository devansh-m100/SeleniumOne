/*
 * 4) A simple program to verify whether user return to the login page successfully
 * @author Devansh M(Expleo Group)
 * since JDK17 08/30/2023
 */

package com.seltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();  
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin", Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123", Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		String s = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
		
		
		//We verify by checking an element on the login page is there or not by taking the login word written there.
		//Ternary Operator in Java is used here
		System.out.println((s.equals("Login")) ? "The User Successfully returned to the Login Page" : "The User could not Successfully return to the Login Page");
		
	}

}
