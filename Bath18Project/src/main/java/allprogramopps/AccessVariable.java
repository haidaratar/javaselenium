package allprogramopps;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessVariable {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver","chrome","dirver",null);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// WebElement days=driver.findElement(By.id("day"));
		// Select day=new Select(days);
		// day.selectByVisibleText("2");

		/*
		 * WebElement monts=driver.findElement(By.id("month")); Select month=new
		 * Select(monts); month.selectByVisibleText("May");
		 * 
		 * WebElement years=driver.findElement(By.id("year")); Select year=new
		 * Select(years); year.selectByVisibleText("1994");
		 */

		Select day = new Select(driver.findElement(By.id("month")));
		// day.selectByVisibleText("Jun");
		List<WebElement> alltext = day.getOptions();
		System.out.println("The total number of month is:" + alltext.size());

		for (int i = 0; i < alltext.size(); i++) {

			String allmonthss = alltext.get(i).getText();
			System.out.println(allmonthss);

		}
		WebElement defaultday = day.getFirstSelectedOption();
		String dayys = defaultday.getText();
		System.out.println("The default month is:" + dayys);

		Thread.sleep(2000);
		driver.close();

	}
}
