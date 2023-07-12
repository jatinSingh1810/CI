package Gmail_Automate;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class TestPageFullScrenShot {

	public static void main(String[] args) throws IOException {
WebDriver driver= new FirefoxDriver();



driver.get("https://Way2automationn.com");
driver.manage().window().maximize();
//File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

Files.copy(f, new File("C:\\Users\\91981\\Downloads\\Sample Folder\\Fullpagesample3.jpg"));

//FullPage




	}

}
