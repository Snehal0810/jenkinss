package basicScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Passdatarefreshpassagain {

	public static void main(String[] args) 
	{	
		 System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
         WebDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("sneha");
		driver.navigate().refresh();
		ele.sendKeys("abcd");
		
	}

}
