package Batch18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseNumber {

	
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Haidar");
		driver.findElement(By.name("lastname")).sendKeys("Aatr");
		driver.findElement(By.name("reg_email__")).sendKeys("8080602069");
		driver.findElement(By.id("password_step_input")).sendKeys("Haidar@786");
		driver.findElement(By.name("birthday_age")).sendKeys("25");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
	}
}
