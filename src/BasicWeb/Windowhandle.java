package BasicWeb;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandle {
	
	public static void main (String [] args) {
		WebDriver driver;
		String BaseURL ="https://unbounce.com/product-marketing/awesome-website-popup-design-examples-delight-equation/";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(BaseURL);
	   driver.findElement(By.xpath("//a[text()='POPUPS']")).click();
	   
	      Set<String> handler =driver.getWindowHandles();
		
		  for ( String handler1 : handler) { System.out.println(handler1); }
		 
	   System.out.println("The page of page is ====>" +driver.getTitle());
	       
	       
        Iterator<String> It =  handler.iterator();	 
       `
         String parentwindow = It.next();
         //System.out.println("The parent window===>" +parentwindow);
         	
         String childwindow = It.next();
         //System.out.println("The child window===>" +childwindow);
         
         driver.switchTo().window(childwindow);
         
	
		 WebElement LoginBtn=
		 driver.findElement(By.xpath("//li[@class='top-btn btn-outline menu-log-in']"));
		 
		 LoginBtn.click();
		  
		 /* WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions. visibilityOfElementLocated(By.
		 * xpath("//li[@class='top-btn btn-outline menu-log-in']")));
		 */
  
		/*
		 * JavascriptExecutor js = ((JavascriptExecutor)driver);
		 * 
		 * js.
		 * executeScript("document.getElementByID('//li[@class='top-btn btn-outline menu-log-in').click();"
		 * );
		 */
		 
		 WebElement Acct_create= driver.findElement(By.xpath("//div[@class='auth-alternate-option']//parent::a[@id='start_trial']"));
		 Acct_create.click();
		 
		/*
		 * Actions act = new Actions(driver);
		 * 
		 * act.contextClick(ForgotLnk);
		 * 
		 */
		 
       
          WebElement Contact_Us = driver.findElement(By.xpath("//a[@class='primary-btn btn w-100'][contains(text(),'Contact Us')]"));
          
        	JavascriptExecutor js = (JavascriptExecutor)driver;
        	
        	js.executeScript("arguments[0].scrollInToView();", Contact_Us);
        	
        	Contact_Us.click();
        }
	}


