package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demohidden {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		//driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Sneha@kk.com");

	}

}
