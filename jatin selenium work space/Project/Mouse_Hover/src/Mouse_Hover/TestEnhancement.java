package Mouse_Hover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestEnhancement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	WebElement link=	driver.findElement(By.linkText("Gmail"));
		int x = link.getRect().getX();
		int y = link.getRect().getY();
		
		Actions action= new Actions(driver);

		action.moveByOffset(x, y).click().perform();
	
	
	
	}

}
