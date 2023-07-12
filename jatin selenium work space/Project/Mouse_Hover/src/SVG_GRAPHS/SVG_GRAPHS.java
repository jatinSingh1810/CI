package SVG_GRAPHS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SVG_GRAPHS {

	private static By by;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.covid19india.org/");
Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[4]/div[2]/div/div[9]/div[1]/div[1]")).click();
Thread.sleep(5000);



driver.findElement(by.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[4]/div[2]/div/div[9]/div[1]/div[1]")).click();

List <WebElement> graphPoints = driver.findElements(By.xpath("(//*[name()='svg' and @ preserveAspectRatio='xMidYMid meet'])//*[local-name()='circle']"));
		Actions action = new Actions(driver);
		for (WebElement point : graphPoints)

			action.moveToElement(point).perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='stats is-confirmed']/div/h2")).getText());

	}

}
