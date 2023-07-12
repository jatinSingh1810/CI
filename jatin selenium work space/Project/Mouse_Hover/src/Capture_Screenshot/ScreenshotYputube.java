package Capture_Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenshotYputube {

	private static final File ScreenshotFile = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.get("https://www.ebay.com.au/");
	//Screenshot of Whole Page
	File ScreenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(ScreenshotFile, new File("C:\\Users\\91981\\Downloads\\Sample Folder.jpg"));
	
	//Thread.sleep(4000);
	//File ScreenshotFile1= driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).getScreenshotAs(OutputType.FILE);
	
	//Files.copy(ScreenshotFile1, new File ("C:\\Users\\91981\\Downloads\\Sample Folder.jpg"));
	
	
	//Files.copy(ScreenshotFile1, new File(System.getProperty("user.dir")+"\\screenshot.png"));
	}

}
