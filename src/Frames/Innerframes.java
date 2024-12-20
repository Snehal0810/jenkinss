package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Innerframes 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/Htmlfiles/f1.html");
		driver.findElement(By.id("a1")).sendKeys("ansh");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
        WebElement ele=	driver.findElement(By.id("a2"));
		ele.sendKeys("admon@12");
		//Thread.sleep(1000);
		
		driver.switchTo().frame("a3");
		driver.findElement(By.id("a3")).sendKeys("1234");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		ele.clear();
	}

}
