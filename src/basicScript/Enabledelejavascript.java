package basicScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enabledelejavascript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/Disabledelement.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("document.getElementById('a1').value='hello'");

	}

}
