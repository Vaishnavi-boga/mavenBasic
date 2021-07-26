package basicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFacebook {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Data\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("https://www.facebook.com/");
		browser.findElement(By.name("email")).sendKeys("vaishnav24@gmail.com");
  }
}
