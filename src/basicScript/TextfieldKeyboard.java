package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextfieldKeyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/textfieldkeyboaerd.html");
		Thread.sleep(1000);
		WebElement ele1=driver.findElement(By.id("a1"));
		ele1.sendKeys("selenium");
		Thread.sleep(1000);
	   WebElement ele2=driver.findElement(By.id("a2"));
	   ele2.sendKeys("selenium");
		Thread.sleep(1000);
		WebElement ele3=driver.findElement(By.id("a3"));
		ele3.sendKeys("selenium");
		Thread.sleep(1000);
		ele3.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		ele1.sendKeys(Keys.CONTROL+"ax");
		driver.quit();
		
	}

}
