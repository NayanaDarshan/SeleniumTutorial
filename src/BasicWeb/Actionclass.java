package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	
	public static void main(String[] args) {
	
	WebDriver driver;
	String BaseURL ="https://www.goindigo.in/";
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
	
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.get(BaseURL);
   
   
   Actions act = new Actions(driver);
   WebElement Booklnk= driver.findElement(By.xpath("//a[contains(text(), 'Book')]//parent::li[@class='topNavItem']"));
   act.moveToElement(Booklnk).build().perform();
   driver.findElement(By.xpath("//a[contains(text(),\"About booking online\")]")).click();
   System.out.println(driver.getTitle());
   
	}

}
