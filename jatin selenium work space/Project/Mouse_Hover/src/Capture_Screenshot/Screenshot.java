package Capture_Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
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
		
List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		for (WebElement frame:frames) {

			
			System.out.println( frame.getAttribute("id"));		
	}

File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(Screenshot, new File("C:\\Users\\91981\\Downloads\\Sample.jpg"));
	}
	


}