package com.SeleniumDayFive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		public static void sendKeys(WebDriver driver1, WebElement element,   
				int timeout, String value) {  
				new WebDriverWait(driver1,   
				timeout).until(ExpectedConditions.visibilityOf(element));  
				element.sendKeys(value);  
			}  
	}

}
