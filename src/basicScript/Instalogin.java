package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Instalogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d _ap35']")).sendKeys("9421603533");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123hgh4");
		driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']")).click();
		driver.quit();

	}

}
