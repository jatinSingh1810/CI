package Gmail_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		// driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.name("country")).sendKeys("Germany");
driver.findElements(By.xpath(null))
	}

}
