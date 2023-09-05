import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority {
	WebDriver driver;
	
  @Test(priority = 2)
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority = 1)
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f3() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.apple.com/");
	  
	  driver.manage().window().maximize();
  }
}
