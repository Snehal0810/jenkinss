package basicScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closeperticulatbrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allwh=driver.getWindowHandles();
			
	 
		//Thread.sleep(2000);
		for (String st : allwh)
		{
			driver.switchTo().window(st);
		  String title=driver.getTitle();
		  System.out.println(title);
		  Thread.sleep(2000);
		  if(title.equals("About me - qavalidation"))
		  {
			driver.close();
			
		}

	}

	}
}
