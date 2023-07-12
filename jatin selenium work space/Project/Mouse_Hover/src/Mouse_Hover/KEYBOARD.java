package Mouse_Hover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYBOARD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.findElement(By.id("identifierId")).sendKeys("jatin.singh18101989@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();

	
	Actions action= new Actions(driver);
	
	
	action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
	action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();

	
	driver.findElement(By.id("identifierId")).click();
	action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();

	
	
	
	
	//action.sendKeys(Keys.ENTER).perform();
	
	}

}
