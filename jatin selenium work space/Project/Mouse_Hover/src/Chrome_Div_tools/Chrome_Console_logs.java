package Chrome_Div_tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Chrome_Console_logs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
	
		devTools.send(org.openqa.selenium.devtools.v112.log.Log.enable());
		devTools.addListener(org.openqa.selenium.devtools.v85.log.Log.entryAdded(), entry ->  entry.getText());
		
		System.out.println("Time is : +entry.getText()");
		System.out.println("Time is : +entry.getTimeStamp()");
		
		driver.get("http://www.flipkart.com");

		((JavascriptExecutor) driver).executeScript("console.log('This is sample log')");
		((JavascriptExecutor) driver).executeScript("console.log('This aaaaaaaa sample log')");

		
	}
}
