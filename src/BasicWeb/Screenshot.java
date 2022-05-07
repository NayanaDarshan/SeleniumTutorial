package BasicWeb;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\libs\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();

	}

	
	public static void Takescreenshot(String filename) {
		
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	FileUtils.copyfile(srcfile, Destinationfile);
	//	FileUtlis.copyfile(file, new File("give the path"));
		
		
	}
		
		
		
		
	}

