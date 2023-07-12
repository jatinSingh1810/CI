package Gmail_Automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class TestDropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		// driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.name("country")).sendKeys("Germany");
		WebElement DropDown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(DropDown);
		// select.selectByVisibleText("Eesti");
		select.selectByValue("af");
		//ForSize
		List<WebElement> values = driver.findElements(By.tagName("Option"));

		System.out.println("Total values are :   " + values.size());
		System.out.println(values.get(9).getText());
//Total Attribute on the page	
		for (int i = 0; i < values.size(); i++) {

			System.out.println(values.get(i).getAttribute("lang"));

			// Total Links on the page
			WebElement block = driver.findElement(By.xpath("//*[@id=\'www-wikipedia-org\']/div[7]/div[3]"));
			List<WebElement> links = block.findElements(By.tagName("a"));

			// List <WebElement> links =driver.findElements(By.tagName("a"));

			// System.out.println(links.size());

			// for (WebElement link : links) {

			// System.out.println("link.getText()+------URL IS===="
			// +link.getAttribute("href"));

		}

	}

}
