package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {
    static WebDriver driver;
    
	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\libs\\chromedriver.exe");
	 driver = new ChromeDriver();
     driver.get("https://www.google.com");
	}

}
