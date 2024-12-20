package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swappingwithkeyboard {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/Swappingwithkeyboard.html");
		Thread.sleep(2000);
	    WebElement ele1= driver.findElement(By.id("t1"));
	    ele1.sendKeys(Keys.CONTROL+"ax");
	    Thread.sleep(2000);
	    WebElement ele2=driver.findElement(By.id("t3"));
	    ele2.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	    WebElement ele3=driver.findElement(By.id("t2"));
	    ele3.sendKeys(Keys.CONTROL+"ax");
	    ele1.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	    ele2.sendKeys(Keys.CONTROL+"ax");
	    ele3.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	}

}
