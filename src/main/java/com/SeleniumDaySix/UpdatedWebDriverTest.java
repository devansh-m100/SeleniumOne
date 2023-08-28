package com.SeleniumDaySix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class UpdatedWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In the recently updated WebDriverManager 5.5.2 we can avoid the driver.setProperty completely 
		
		/*
		 * //In the new version
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 */
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dataBoxField = driver.findElement(By.xpath("//div[@class = 'oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']//parent"));
		
		WebElement userName = driver.findElement(with(By.tagName("input")).below(dataBoxField));
		
		userName.sendKeys("Successful");
	
	}

}
