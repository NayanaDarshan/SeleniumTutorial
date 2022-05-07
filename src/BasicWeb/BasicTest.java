package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicTest {

	static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (8)\\chromedriver.exe");
      	
      	driver= new ChromeDriver();
      	
      	driver.manage().window().maximize();
      	
      	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
      	
      	driver.get("https://google.com");
      	
      
      	
	}

}
