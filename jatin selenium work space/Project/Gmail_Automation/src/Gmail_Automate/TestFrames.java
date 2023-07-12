package Gmail_Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.gmail.com");
		
		
		System.out.println(driver.getTitle());
		
		
		
		
		//driver.findElements(By.tagName("a")).size();
		

	
	}

}
