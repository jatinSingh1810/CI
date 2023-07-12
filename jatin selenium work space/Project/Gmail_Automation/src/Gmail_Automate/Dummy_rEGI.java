package Gmail_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy_rEGI {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("jatin");
Thread.sleep(2000);

WebElement Submit=driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[1]/div[2]/input"));

 //driver.findElement(By.className("button"));
Submit.click();


System.out.println("done");

//driver.close();


	}

}
