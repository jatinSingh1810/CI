package Gmail_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locators {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.navigate().to("https://www.google.com");

		driver.manage().window().maximize();
		
WebElement above=driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		Thread.sleep(-1000);
above.sendKeys("jatin.singh18101989@gmail.com");
	
	
	WebElement below= driver.findElement(RelativeLocator.with(By.tagName("Input")).below(By.tagName("select")));
	below.sendKeys("minku");
	
	
	//WebElement near= driver.findElement(RelativeLocator.with(By.tagName("Input")).below(By.tagName("select")));

	WebElement rightof= driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).toRightOf(By.tagName("label")));
	rightof.sendKeys("fkjnf");
	WebElement leftof= driver.findElement(RelativeLocator.with(By.linkText("signin")).toLeftOf(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[1]/div[2]/input")));
	leftof.click();
	
	
	}

}
