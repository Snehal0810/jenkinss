package Synchronizationss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	
		// BY using title	
		//String title=driver.getTitle();
		//System.out.println(title);
		//WebDriverWait wait=new WebDriverWait(driver, 10);
         //wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		//driver.findElement(By.id("email")).sendKeys("Abxcd");
	
		// by using url
		
	//	String urll=driver.getCurrentUrl();
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.urlContains(urll));
		
		// by using visibility
		WebElement ele=driver.findElement(By.id("email"));
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("abc");
	}

}
