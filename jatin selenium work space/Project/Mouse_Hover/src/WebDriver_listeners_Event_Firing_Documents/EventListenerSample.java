package WebDriver_listeners_Event_Firing_Documents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;


public class EventListenerSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver webdriver = new ChromeDriver();//object

	WebDriverListener listener = new WebDriver_listeners();//class
		
WebDriver driver  =new EventFiringDecorator(listener).decorate(webdriver);

driver.get("http://www.gmail.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("identifierId")).sendKeys("java@way2automation.com");
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("password");

driver.quit();

	
	
	}

}
