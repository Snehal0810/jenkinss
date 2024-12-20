package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usefindelement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("Abcds");
		driver.findElement(By.id("pass")).sendKeys("12344");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
	}

}
