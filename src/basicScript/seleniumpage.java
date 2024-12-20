package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumpage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='JavaScript']/../p[4]")).click();
		Thread.sleep(1000);
	}

}
