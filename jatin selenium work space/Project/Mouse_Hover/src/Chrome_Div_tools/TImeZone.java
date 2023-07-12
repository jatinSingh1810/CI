package Chrome_Div_tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.emulation.Emulation;

public class TImeZone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://whatismytimezone.com/");
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setTimezoneOverride("EST"));
		Thread.sleep(4000);
		driver.get("https://whatismytimezone.com/");
		
		
		
	}

}
