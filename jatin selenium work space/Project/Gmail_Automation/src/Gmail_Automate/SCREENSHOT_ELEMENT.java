package Gmail_Automate;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SCREENSHOT_ELEMENT {

	public static void main(String[] args) throws IOException {

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		Files.copy(f, new File("C:\\Users\\91981\\Downloads\\Sample Folder\\sample.jpg"));
		
		
	}

	
	}


