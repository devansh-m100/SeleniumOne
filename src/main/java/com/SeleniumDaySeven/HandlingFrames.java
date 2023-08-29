/*
 * A simple program to handle frames in Selenium
 * @author Devansh M(Expleo Group)
 * since JDK17 08/29/2023
 */

package com.SeleniumDaySeven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//here iframe being a tag most of the time it points to more than one elements, so its better to use driver.findelements rather than driver.findelement
		
		//use webelement when you want to store location in & use it later.
		//when you want to simply locate use the locator method.
		
		//to overcome overlay of ads 
//	    JavascriptExecutor jss = (JavascriptExecutor)driver;
//	    jss.executeScript("window.scrollBy(0, 100)", "");
	    
	    //So text is inside the frame so to access it using frames
	    
	    driver.switchTo().frame("frame1");
	    
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	    String res = driver.findElement(By.id("sampleHeading")).getText();
	    
	    System.out.println(res);
	    
	    String res1 = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText();
	    
	    driver.switchTo().defaultContent();
	    
	    System.out.println(res1);
	    
	    driver.quit();
	    
	}
}

/*
 * Notes - 
 * 1) Frame have an inbuilt Html tags and its own structure that is why while not in frame we cannot access frame content.
 * 2) And while being inside frame we cannot access any other content outside frame which is generally in / inside the webpage.
*/