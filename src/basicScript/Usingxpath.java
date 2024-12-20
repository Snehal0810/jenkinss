package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usingxpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@name='login']")).click();


	}

}
