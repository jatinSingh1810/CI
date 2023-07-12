package Capture_Screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Elememnt_SCreenshot {

	public static void main(String[] args) throws IOException {
	
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.way2automation.com/");

	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	
	WebElement ele= driver.findElement(By.xpath("//*[@id=\"MzUwOjY5OQ==-1\"]"));
	File Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	BufferedImage FullImg= ImageIO.read(Screenshot);
	
	Point point= ele.getLocation();
	
	int eleheight = ele.getSize().getHeight();
	
	int elewidth = ele.getSize().getWidth();
	
	BufferedImage eleScreenshot = FullImg.getSubimage(point.getX(), point.getY(), eleheight, elewidth);
	
	ImageIO.write(eleScreenshot, "jpg", Screenshot);
	
	File ScrrenshotLocation = new File("C:\\Users\\91981\\Downloads\\Sample Folder");
	
	Files.copy(Screenshot, ScrrenshotLocation);
	
	}


	}


