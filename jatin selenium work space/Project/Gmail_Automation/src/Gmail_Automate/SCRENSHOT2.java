package Gmail_Automate;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SCRENSHOT2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Files.copy(f, new file"C:\\Users\\91981\\Downloads\\Sample Folder\\sample2.jpg");
		Files.copy(f, new File("C:\\Users\\91981\\Downloads\\Sample Folder\\sample2.jpg"));

		
		
	}

}
