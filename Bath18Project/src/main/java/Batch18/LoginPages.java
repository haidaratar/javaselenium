package Batch18;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPages {

	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement months=driver.findElement(By.id("month"));
		Select mon=new Select(months);
	
		List<WebElement>allmonths=mon.getOptions();
		
		System.out.println("The toatl number of month is:"+allmonths.size());
		
		for(int i=0;i<allmonths.size();i++) {
			
			String drop_down=allmonths.get(i).getText();
			
			System.out.println(drop_down);
		}
			
				
		
		//WebElement defaultmonths=mon.getFirstSelectedOption();
		//System.out.println(defaultmonths.getText());
		
	
		//WebElement default1=mon.getFirstSelectedOption();
		//System.out.println("The default month is:"+default1);
		
		WebElement first_values=mon.getFirstSelectedOption();
		String values=first_values.getText();
		System.out.println("The default month is:"+values);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}
}
