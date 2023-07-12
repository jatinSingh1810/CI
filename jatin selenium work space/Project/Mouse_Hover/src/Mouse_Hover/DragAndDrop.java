package Mouse_Hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://google.com");
		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();
Thread.sleep(5000);

driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[1]/a")).click();

WebElement draggable = driver.findElement(By.id("draggable"));

WebElement droppable =	driver.findElement(By.id("droppable"));

Actions action = new Actions(driver);
action.dragAndDrop(draggable, droppable).perform();


		
		
	}

}
