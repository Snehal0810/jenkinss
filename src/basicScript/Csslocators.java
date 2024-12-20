package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocators {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Abcds");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12344");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

	}

}
