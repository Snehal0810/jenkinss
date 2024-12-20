package Synchronizationss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demosynchroniztions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		allwh.remove(p_id);
		for (String st : allwh) 
		{
		  driver.switchTo().window(st);	
		}
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("snehal.thorat0810@gmail.com");
		driver.findElement(By.xpath("//button[.='Subscribe']")).click();		
	}

}
