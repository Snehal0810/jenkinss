package basicScript;


import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollwithclickaction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		
		//use getlocation method to find location 
		WebElement ele=driver.findElement(By.xpath("//a[.='Careers']"));
	    Point p=ele.getLocation();
		int y=p.getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,'y')");
		Thread.sleep(1000);
		ele.click();
		
		//driver.quit();
		

	}

}
