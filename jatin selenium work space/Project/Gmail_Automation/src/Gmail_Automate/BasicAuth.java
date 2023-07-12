package Gmail_Automate;

import java.time.Duration;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));

		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
	
	
	
	
	
	}

}
