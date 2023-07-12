package Mouse_Hover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlideAnElementa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/slider/");
		driver.findElement(By.name("q")).sendKeys("https://jqueryui.com/slider/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[8]/center/input[1]")).click();
Thread.sleep(5000);


WebElement Slider = driver.findElement(By.xpath("/This element is in iframe - //span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-focus']"));
	
	new Actions(driver).dragAndDropBy(Slider, 0, 400).perform();
	
	
	
	}

	
	
}
