package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Data\\chromedriver_win32\\chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			
			browser.get("https://www.facebook.com/");
	}

}
