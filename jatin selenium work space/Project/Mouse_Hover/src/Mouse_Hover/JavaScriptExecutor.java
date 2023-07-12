package Mouse_Hover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//.get("");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		
		JavascriptExecutor js =(JavascriptExecutor)driver ;
		js.executeScript("myFunction()");
		
		js.executeScript("arguments[0].style.border='3px solid red'" , driver.findElement(By.xpath("//*[@id=\"mySubmit\"]")));
		
		driver.switchTo().defaultContent();
	}

}
