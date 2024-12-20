package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorfirst {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Htmlfiles/Locator.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("i1")).click();
		driver.findElement(By.className("c1")).click();
	}

}
