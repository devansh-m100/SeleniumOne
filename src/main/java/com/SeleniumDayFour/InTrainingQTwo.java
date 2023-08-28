package com.SeleniumDayFour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InTrainingQTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setting up Selenium, Browser Automation Testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
		//open flipkart application
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//search samsung mobile F series & print it
		
		//first we search mobile
		
		driver.findElement(By.name("q")).sendKeys("Mobile", Keys.ENTER);
				
		Thread.sleep(3000);
		
		//samsung checkbox select
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]")).click();
		
		Thread.sleep(3000);
		
		//Display all the titles of the mobiles
		
		List <WebElement> data = driver.findElements(By.className("_4rR01T"));
				
		for(WebElement iter1 : data) {
			if(iter1.getText().contains("F")) {
			System.out.println(iter1.getText());
				}
		}
		
		Thread.sleep(3000);
		
		//scroll the page 
		//Functionality not directly available in Selenium 
		//So use JavaScript 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0, 10000)","");
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0, -10000)","");
		
		//driver.quit();
		
		
	}

}
