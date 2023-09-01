/*
 * 3) A simple program to do testing on Naukri Application
 * @author Devansh M(Expleo Group)
 * since JDK17 08/30/2023
 */

package com.seltest;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //Creating Object of ChromeDriver
        
        WebDriver driver= new ChromeDriver();
        //Create wait object
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        //create action object

        Actions actions= new Actions(driver);
        
        //1. Open the Page: https://www.naukri.com/

        driver.get("https://www.naukri.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));        

        //2. Click on the Remote

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,250)", "");

        driver.findElement(By.partialLinkText("Remote")).click(); //Remote Link click

        //3. switch the control to the child window opened.

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(newTab.get(1));

        //4. Apply any two filters and select the first job in the result.
        //select Workfrome home filter

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Work from office']"))).click();

        //select Engineering filter

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Engineering - Software & QA']"))).click();

        //first job select

        WebElement jobtitle= driver.findElement(By.xpath("//article[@data-job-id='300823500754']"));

        System.out.println(jobtitle.getText());

        //5.Switch to back

        driver.close();

        //6.search box test

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[1]/div/div/div/div[1]/div/input")).sendKeys("Expleo",Keys.ENTER);
        
        //7.close the window
        
        driver.quit();   
        
    }
}
