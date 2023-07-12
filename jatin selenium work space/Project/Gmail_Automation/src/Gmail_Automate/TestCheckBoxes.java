package Gmail_Automate;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();


	/*
	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]")).click();
	
	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]")).click();
	
	
	
		/*for(int i =1; i<=4; i ++) {
			//driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]")).click();

		
		/*int i=1;
		int Count=0;
		while (isElementPresent(By.xpath("//div[4]/input["+i+"]")));
			
		{
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
i++;
	Count++;		
			
		}
		System.out.println("Total Checkboxes are:"+Count);*/
	WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
	List <WebElement> checkboxes = block.findElements(By.name("sports"));
	System.out.println("Total checkboxes are :"+checkboxes.size());
	
	for(WebElement checkbox :checkboxes) {
		checkbox.click();
		
		
	}
	
	
	
	}

	

	
	
}
