package Chrome_Div_tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.security.Security;

public class SSL {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
DevTools devTools = ((ChromeDriver)driver).getDevTools();
	
devTools.createSession();

devTools.send(Security.enable());

devTools.send(Security.setIgnoreCertificateErrors(false));

driver.get("http://www.google.com");
	
	
	}
}
