/*
 * A simple program to Handle Exceptions & Dialog Boxes
 * @author DevanshM(Expleo Group)
 * since JDK11 08/29/2023
 */

/*
 * 
 */
package com.SeleniumDaySeven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DialogBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);  
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement txtboxElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		
		txtboxElement.sendKeys("301");
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//Now since alert has a different DOM structure, we need to create a separate class for it
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();
	
		a1.accept();
		
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		Alert a2 = driver.switchTo().alert();
		
		a2.accept();
		
		Thread.sleep(2000);
		//driver.findElement(By.);	
	
	}
}
/*
 * 3 types of alerts - Simple, Prompt,  
 */
*/