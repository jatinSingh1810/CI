package Gmail_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.locators.RelativeLocators
public class TestMultipleRelativeLocators {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("lable")).	
	}

}
