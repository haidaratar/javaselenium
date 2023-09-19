package Batch18;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.support.ui.ExpectedConditions
//import org.openqa.selenium.support.ui.WebDriverWait
public class SampleProject {

	public static void main(String[] args) throws Exception  {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("testing");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//span[text()='testing'])[position()=2]"))));
		//Webdriver.findElement(By.xpath("WebDriverWait wait = new WebDriverWait(driver,30);"));
		
		List <WebElement>alltext=driver.findElements(By.xpath("//span[text()='testing']"));
		
		System.out.println("The total number of text is:-"+alltext.size());
		
		
		for(int i=0;i<alltext.size();i++)
		{
			System.out.println(alltext.get(i).getText());
		}
		
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
