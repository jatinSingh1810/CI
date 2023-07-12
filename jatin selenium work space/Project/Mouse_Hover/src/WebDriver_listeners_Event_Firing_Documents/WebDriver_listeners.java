package WebDriver_listeners_Event_Firing_Documents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebDriver_listeners implements WebDriverListener{

  public void  afterClick(WebElement element) {
	  
	  
	  System.out.println("Clicking on Element : + +element");
  }
		
	public void afterQuit(WebDriver driver ) {
		
		  System.out.println("Test Execution is Completed");

		
	}
	

	//public void afterSendKeys(Alert alert, String text) {
		
		
	//}
	
	public void afterSendKeys(WebElement element ,CharSequence...KeysToSend) {

		
		System.out.println("Typing in a Element :"+element+" entered the value as :" +KeysToSend);

	}
}
