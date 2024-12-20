package basicScript;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxselection {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/Checkboxtestcase.html");
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(1000);
	    WebElement ele=driver.findElement(By.id("c1"));
		ele.sendKeys(Keys.SPACE);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement ele1=driver.findElement(By.id("c2"));
		ele1.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		 WebElement ele2=driver.findElement(By.id("c3"));
		ele2.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		WebElement ele3=driver.findElement(By.id("c4"));
		ele3.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		 WebElement ele4=driver.findElement(By.id("c5"));
		ele4.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		ele4.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		ele3.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		ele2.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		ele1.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		ele.sendKeys(Keys.SPACE);
		
	}

}
