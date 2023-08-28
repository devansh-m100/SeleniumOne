package com.SeleniumDayThree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PlaceAnOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setting up Selenium, Browser Automation Testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
				
		WebDriver driver = new ChromeDriver(co);
		
		//1 open (go to / navigate to the website)
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		//2 Select any username among the given ones & also the password & enter them in the username & password text boxes provided
		
		//here we select the username among the given ones & fill in the username text box
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user", Keys.ENTER);
		
		//here we select the password among the given ones & fill in the password text box
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce", Keys.ENTER);
		
		Thread.sleep(1500);
		
		//click on login
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		Thread.sleep(1500);
		
		//3 select a product among the visible products
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		
		Thread.sleep(1500);
		
		//4 Press Add to Cart
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		Thread.sleep(1500);
		
		//5 Press the cart icon to go the cart
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		Thread.sleep(1500);
		
		//6 Press on continue shopping
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		Thread.sleep(1500);
		
		//7 Fill in the "Checkout: Your Information"
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Girgaum");
		
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Chowpatty");
		
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("400004");
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		
		String s = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		System.out.println(s);
		
	}

}
