package Synchronizationss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwiatdemoapp {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		
		//String title=driver.getTitle();
		//System.out.println(title);
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Synchronization"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
         WebElement ele=driver.findElement(By.xpath("//button[.='Start']"));
	   //	wait.until(ExpectedConditions)
		
		wait.until(ExpectedConditions.visibilityOf(ele));
         ele.click();
	//	driver.findElement(By.
		driver.findElement(By.xpath("//button[.='Reset']")).click();
	}

}
