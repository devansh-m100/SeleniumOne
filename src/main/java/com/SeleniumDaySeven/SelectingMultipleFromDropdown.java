package com.SeleniumDaySeven;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingMultipleFromDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//select also has many list items inside it because select is used for drop downs list so inside select we have list items list tag, SO WE NEED TO CREATE SELECT CLASS 
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id = \"input-sort\"]")));
		
		//Each and every item in the list / dropdown has the datatype of "WebElement"
		List<WebElement> li = sel.getOptions();
		
		//This code is for printing the sort elements 
		//Array List generic if we give as a String Datatype, automatically the list elements would be stored as Strings only, so no need to type cast it by toString() or (String)
		ArrayList <String> ascOrder = new ArrayList<String>();
		
		for(WebElement it : li) {
			ascOrder.add(it.getText());
		}
		
		Collections.sort(ascOrder);
		
		for(String iter: ascOrder) {
			System.out.println(iter);
		}
		//This code is for printing the sort elements 
		
		//This is the way to click any option in the drop down / list
		sel.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.price&order=DESC");
		
		sel.selectByVisibleText("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.sort_order&order=ASC");
		
		//System.out.println(li);
		
	}

}
