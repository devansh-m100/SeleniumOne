import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
  WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  
	  driver.manage().window().maximize();
	  
	  //Search Hello & click Enter
	  driver.findElement(By.name("q")).sendKeys("Hello", Keys.ENTER);
	  
	  //Verify whether actual & entered titles are same
	  assert.assertEquals(driver.getTitle(), "Hello - Google Search");
  }
}
