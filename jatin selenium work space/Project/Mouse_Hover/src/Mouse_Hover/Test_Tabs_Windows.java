package Mouse_Hover;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Tabs_Windows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[11]/div[3]/div/div/div/div/div/div[1]/span/a")).click();

		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/div/div[3]/div/div[3]/div/div/div/div/div/button")).click();
		
		
	}

}
