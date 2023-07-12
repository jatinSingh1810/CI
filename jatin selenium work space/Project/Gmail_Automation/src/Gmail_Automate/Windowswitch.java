package Gmail_Automate;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowswitch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.google.com");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.gmail.com");
	
	
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	driver.get("http://www.wwe.com");
	Thread.sleep(10000);
	driver.quit();
	
	
	}

}
