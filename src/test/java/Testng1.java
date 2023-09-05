import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng1 {
  WebDriver driver;
  @Test
  public void f() {
	  
	  //This example is used for parallel testing
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  
	  driver.manage().window().maximize();
	  
  }
 }

