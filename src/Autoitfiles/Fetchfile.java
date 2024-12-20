package Autoitfiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fetchfile {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/fetchfile.html");
		WebElement ele=driver.findElement(By.id("f1"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\sneha\\OneDrive\\Desktop\\Autofiles\\fetchfile.exe");

	}

}
