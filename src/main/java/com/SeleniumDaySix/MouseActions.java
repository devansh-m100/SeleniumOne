package com.SeleniumDaySix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.browserstack.com/?utm_source=bing&utm_medium=cpc&utm_platform=paidads&utm_content=&utm_campaign=Bing-Search-Brand-India&utm_campaigncode=BrowserStack-Alpha+156924&utm_term=e+browserstack&msclkid=e79865cf6cd61b8261e40123efc29286");
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Actions builde = new Actions (driver);
		
		//WebElement Element = driver.findElement(By.xpath("//*[@id=\"product-menu-toggle\"]"));
		
		//WebElement DblClick = driver.findElement(By.xpath("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[1]/h1"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//builder.moveToElement(Element).perform();
		
		//builder.contextClick(Element).perform();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//builder.doubleClick(DblClick).perform();
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		
		jss.executeScript("window.scrollBy(100, 0)");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement Drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement Drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		builde.clickAndHold(Drag).release(Drop).build().perform();
		
		builde.dragAndDrop(Drag, Drop);
	
	}

}
