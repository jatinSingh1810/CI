package Gmail_Automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElements {
	


	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		// driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());

		
		
	}

}
