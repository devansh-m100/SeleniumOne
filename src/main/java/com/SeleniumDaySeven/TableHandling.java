package com.SeleniumDaySeven;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        List <WebElement> table = driver.findElements(By.xpath("//*[@id=\"table1\"]//tr"));

        for(WebElement i:table) {
            System.out.println(i.getText());
        }
        
        List <WebElement> table1 = driver.findElements(By.xpath("//*[@id=\"table1\"]//td[3]"));

        for(WebElement i:table1) {
            System.out.println(i.getText());
        }

        System.out.println("---------------------------------------------------------");
        List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]//tbody//tr"));
        
        //To print column td is constant tr varies, code is below for loop
        for(int i=0;i<rows.size();i++) {
            WebElement num=driver.findElement(By.xpath("//table[@id='table1']//tr["+(i+1)+"]//td[3]"));
            
            System.out.println(num.getText());
        }
    }
    
}