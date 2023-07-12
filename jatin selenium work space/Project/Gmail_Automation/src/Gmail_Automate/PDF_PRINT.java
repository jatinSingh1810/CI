package Gmail_Automate;

import java.time.Duration;

import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PDF_PRINT {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://Selenium.dev/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Pdf pdf = ((RemoteWebDriver) driver).print(new PrintOptions());
		

	}

}
