package BasicWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownBasics {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.get("https://amazon.in");

	   By amazon_Links=By.xpath("//div[contains(@class,'a-section')]/a");
		/*
		 * By multiselect_btn = By.xpath("//button[contains(@class, 'multiselect')]");
		 * By drp_value =
		 * By.xpath("//ul[contains(@class,'multiselect-container')]//li//a");
		 * doBtnClick(multiselect_btn);
		 */
		// doDrpValueClick(drp_value, "Angular");
		
	   getLinkNames(amazon_Links);
		System.out.println("Action ended");

	}

	public static void getElement(By Locator) {
		driver.findElement(Locator);
	}

	public static void doBtnClick(By locator) {
		driver.findElement(locator).click();
	}

	public static void doDrpValueClick(By Locator, String value) {

		List<WebElement> drpDwn = driver.findElements(Locator);

		System.out.println(drpDwn.size());

		for (int i = 0; i < drpDwn.size(); i++) {
			String text = drpDwn.get(i).getText();

			if (text.equals(value)) {
				drpDwn.get(i).click();
				break;
			}
		}
	}

	public static void doClickAll(By Locator) {

		List<WebElement> drpDwn = driver.findElements(Locator);

		System.out.println(drpDwn.size());
		/*
		 * for( WebElement ele : drpDwn) { ele.click(); }
		 */

		for (int i = 0; i < drpDwn.size(); i++) {

			boolean status = drpDwn.get(i).isSelected();

			System.out.println(status);

			if (!status) {
				drpDwn.get(i).click();
			}

		}

	}
	
	
	public static void getLinkNames(By Locator) {
		List<WebElement> linkNames = driver.findElements(Locator);
		
		System.out.println(linkNames.size());
		for( int i =0; i<linkNames.size();i++) {
			
			String text= linkNames.get(i).getText();
	
			if(!text.isEmpty()) {
				
				System.out.println(i+ " ===>"+ text +"===>"+linkNames.get(i).getAttribute("href"));

			}
		}
}
	
}
