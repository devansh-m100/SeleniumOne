/*
 * 2) A simple program to verify the message “Record Saved Successfully”
 * @author Devansh M(Expleo Group)
 * since JDK17 08/30/2023
 */

package com.seltest;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmartHospitalTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.smart-hospital.in/site/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[5]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[1]/div/a[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("MyTitle", Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//For going to text area, that text area is a special separate web element, so we need to create a separate class for it.\
		
		WebElement webE = driver.findElement(By.xpath("/html/body"));
		
		// Here further we are requiring to use Action class
		
		Actions act = new Actions(driver);
		
		//Now we are able to access the separate web element of that message field that we need to enter.
		
		//so now we are going to move the cursor into the message text box using the action class method because that message text box field is a separate web Element, so we need Actions class methods rather than driver.findElement().click()
		
		act.moveToElement(webE).click().perform();
		
		//we need to enter the method called .perform() to actually make it happen and this is as per the syntax of Actions class methods.
		
		act.sendKeys("This is my demo Message").perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//HERE WE PICK THE DATE, again its a separate webelement so we create class & deal with it separately
		
		WebElement noticeDate = driver.findElement(By.xpath("//*[@id=\"date\"]"));
		
		noticeDate.sendKeys("08302023");
		
		//datepicker1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement publishOn = driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
		
		publishOn.sendKeys("08312023");
		
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement successfull_msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
		
        String msg = successfull_msg.getText();
        
        System.out.println(msg);

        //driver.quit();
        
	}

}
