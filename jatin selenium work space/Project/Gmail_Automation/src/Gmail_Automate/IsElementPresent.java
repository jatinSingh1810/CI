package Gmail_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {

	
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		/*try { 
		driver.findElement(By.xpath(locator));
		return true;
		
	}
	catch (Throwable t ) 
		{
		
		return false;}*/
		
	int size=driver.findElements(by).size();
		
		if (size==0) {
			return false;
		}
		
		else {
			
			return true;
		}
		
		
	}
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		// driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, null);
		System.out.println(isElementPresent(By.id("searchLanguage")));
	
		
		
	}

}
