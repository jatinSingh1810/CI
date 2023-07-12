package Mouse_Hover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://google.com");
		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		WebElement R = driver.findElement((By.xpath("//*[@id=\"resizable\"]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions action = new Actions(driver);
		
action.dragAndDropBy(R, 400, 400);
	
	}

}
