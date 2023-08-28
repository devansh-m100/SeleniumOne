package com.SeleniumDayFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InTrainingQOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmahindrakar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\dmahindrakar\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		driver.manage().window().maximize();
		
		
		//1 check that "red check box" is enabled or not
		
		boolean redCheckBoxEnabled = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isEnabled();
		
		System.out.println("The boolean result of whether Red Check Box is enabled or not is: " + redCheckBoxEnabled);
		
		//2 check that "red check box" is selected or not
		
		boolean redCheckBoxSelected = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isSelected();
		
		System.out.println("The boolean result of whether Red Check Box is selected or not is: " + redCheckBoxSelected);
		
		//3 select orange, green and purple boxes
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();
		
		//4 check that "Internet Explorer" is selected or not
		boolean IeCheckBoxSelected = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]")).isSelected();
				
		System.out.println("The boolean result of whether Internet Explorer Check Box is selected or not is: " + IeCheckBoxSelected);
		
		//5 check that "Opera Radio Button" is selected or not
		boolean OperaRadioButtonSelected = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]")).isSelected();
		
		System.out.println("The boolean result of whether Opera Radio Button is selected or not is: " + OperaRadioButtonSelected);
		
		driver.quit();
		
	}

}
