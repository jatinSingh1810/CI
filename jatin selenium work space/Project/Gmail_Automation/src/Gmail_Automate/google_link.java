package Gmail_Automate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class google_link {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Way2Automation");

Thread.sleep(2000);

driver.findElement(By.name("btnK")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();


Thread.sleep(2000);

WebElement link = driver.findElement(By.xpath("//*[@id=\"post-17\"]/div/div/section[1]/div[1]"));
//List<WebElement> links = link.findElements(By.tagName("a"));

List <WebElement> links =driver.findElements(By.tagName("a"));

System.out.println(links.size());

for (WebElement link1 : links) {

System.out.println("link.getText()+------URL IS===="+link1.getAttribute("href"));

}
}
}