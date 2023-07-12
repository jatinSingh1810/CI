package Chrome_Div_tools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Simulate_devices {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
DevTools devTools = ((ChromeDriver)driver).getDevTools();
devTools.createSession();


Map<String, Object> deviceMetrics = new HashMap<String, Object>() {
	 
	{
		
		put ("width",375);
		put("height",812);
		put("mobile", true);
		put("deviceScaleFactor",50);
		
	}
};
	
((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);

	driver.get("https://se;enium.dev/");
	
	}
	
	
}
	


