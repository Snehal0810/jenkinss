package basicScript;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Apple iPhone 15 (Black, 128 GB)']")).click();
		//to switch tab
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String>l=new ArrayList<String>(allwh);
		String Child_address=l.get(1);
		driver.switchTo().window(Child_address);  //switch tab on new window
		
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='OGrnIL']")).click();
		driver.quit();
	}

}
