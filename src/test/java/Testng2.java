import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * This is a testng class without xml file created, still it is working.
 * 
 * Thus without xml also
 */

public class Testng2 {
	WebDriver driver;
  @Test
  public void f() {
	  
	//This example is used for parallel testing
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }
}
