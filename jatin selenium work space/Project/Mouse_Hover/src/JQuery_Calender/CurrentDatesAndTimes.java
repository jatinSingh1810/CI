package JQuery_Calender;

import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentDatesAndTimes {

	static int targetDay = 0, targetMonth = 0, targetYear = 0;

	static int CurrentDay = 0, CurrentMonth = 0, CurrentYear = 0;

	static int jumpMonthsBy = 0;

	static boolean increment = true;

	public static void main(String[] args) throws InterruptedException {

		String dateToSet = "19/05/2023";

		getCurrentDateMonthandYear();
		System.out.println(CurrentDay + " " + CurrentMonth + " " + CurrentYear);

		GetCurrentDateMonthandYear(dateToSet);
		System.out.println(targetDay + " " + targetMonth + " " + targetYear);

		CalculateHowManyMonthsToJumop();
		System.out.println(jumpMonthsBy);
		System.out.println(increment);

	}

	public static void getCurrentDateMonthandYear() {
		Calendar cal = Calendar.getInstance();

		CurrentDay = cal.get(Calendar.DAY_OF_MONTH);
		CurrentMonth = cal.get(Calendar.MONTH);
		CurrentYear -= cal.get(Calendar.YEAR);

	}

	public static void GetCurrentDateMonthandYear(String dateString) {

		int firstindex = dateString.indexOf("/");
		int lastindex = dateString.lastIndexOf("/");

		String day = dateString.substring(0, firstindex);
		targetDay = Integer.parseInt(day);

		String month = dateString.substring(firstindex + 1, lastindex);
		targetDay = Integer.parseInt(month);

		String Year = dateString.substring(lastindex + 1, dateString.length());
		targetYear = Integer.parseInt(Year);

	}

	public static void CalculateHowManyMonthsToJumop() throws InterruptedException {

		if ((targetMonth - CurrentMonth) > 0) {

			jumpMonthsBy = (targetMonth - CurrentMonth);
		}

		else {

			jumpMonthsBy = (CurrentMonth - targetMonth);
			increment = false;

			WebDriver driver = new FirefoxDriver();
			driver.get("https://v5.material.angular.io/components/datepicker/overview");
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/material-docs-app/app-component-sidenav/mat-sidenav-container/mat-sidenav-content/div/div/div/app-component-viewer/div/div/component-overview/doc-viewer/div/div[1]/example-viewer/div/div[2]/datepicker-overview-example/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button"))
					.click();
			Thread.sleep(4000);

			if (increment) {

				driver.findElement(By.className("mat-calendar-next-button mat-icon-button")).click();
			}

			else {
				driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/div[1]/div/button[2]"));

			}
			driver.findElement(By.linkText(Integer.toString(targetDay))).click();

		}
	}

}
