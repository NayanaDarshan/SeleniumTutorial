package TestNGTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class multilSelect {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		Select sel = new Select("");
		
		List<WebElement> ele = sel.getAllSelectedOptions();
		
		int opt= sel.getAllSelectedOptions().size();
		
	
			System.out.println(ele.get(opt-1).getText());
			
		}
		
		
	}

} 
