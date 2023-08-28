package com.SeleniumDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CorrectedChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
		/*
		driver.get("https://www.google.com/");
		
		//search "google" in search box automatically
		driver.findElement(By.name("q")).sendKeys("google", Keys.ENTER);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		*/
		
		//click google search
		//driver.findElement(By.className("gNO89b")).submit();
		
		//By keys.ENTER also we can press enter automatically
		
		/*
		driver.findElement(By.name("q")).sendKeys("bing", Keys.ENTER);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Mumbai", Keys.ENTER);
		*/
		
//		WebElement gmailBtn = driver.findElement(By.linkText("Gmail"));
//		gmailBtn.click();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		
		WebElement gmailBtn = driver.findElement(By.partialLinkText("Gma"));
		//gmailBtn.click();
		boolean isGmailEnabled = gmailBtn.isEnabled();
		System.out.println(isGmailEnabled);
		
		driver.get("https://www.google.com/");
		
		WebElement searchBoxElement = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		String valueofsrboxxpath = searchBoxElement.getAttribute("aria-expanded");
		System.out.println(valueofsrboxxpath);
		
		WebElement searchBoxElementfullxpath = driver.findElement(By.xpath("//textarea[starts-with(@id,'A')]"));
		String valueofsrboxfullxpath = searchBoxElement.getAttribute("aria-controls");
		System.out.println(valueofsrboxfullxpath);
		
		//driver.quit();
		
		
	}

}
