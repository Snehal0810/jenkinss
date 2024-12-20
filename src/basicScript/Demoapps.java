package basicScript;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Demoapps {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		 ArrayList<String> l1=new ArrayList<String>(allwh);
		  
		  for (String switchs : l1)
		  {
			 switchs=l1.get(1);
			  Thread.sleep(2000);
			  driver.switchTo().window(switchs);
		}
		  Thread.sleep(2000);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800)");
          driver.findElement(By.xpath("//input[@type='checkbox']")).click();
          driver.findElement(By.xpath("//button[.='Accept Our Policy']")).click();
          
          String photo="./Photo/";
  		Date d=new Date();
  		String d1=d.toString();
  		String d2=d1.replaceAll(":", "-");
  		TakesScreenshot ts=(TakesScreenshot) driver;
  		File src = ts.getScreenshotAs(OutputType.FILE);
  		File dst=new File(photo+d2+"demo.jpeg");
  		FileHandler.copy(src, dst);
  		Thread.sleep(2000);
  		driver.quit();
	}

}
