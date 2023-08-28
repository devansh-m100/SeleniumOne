/*
 * Implicit Wait
 * since JDK17 08/25/2023
 */

package com.SeleniumDayFive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SynchronisationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe"); 
		
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
		
		System.out.println((s.equals("Login")) ? "Pass" : "Fail");
	}

}
