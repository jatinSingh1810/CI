package Chrome_Div_tools;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.emulation.Emulation;

public class GeoLocation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
DevTools devTools = ((ChromeDriver)driver).getDevTools();
devTools.createSession();



devTools.send(Emulation.setGeolocationOverride(Optional.of(51.233), Optional.of(-0.118092), Optional.of(100)));

driver.get("https://mycurrentlocation.net/");


	}

}
