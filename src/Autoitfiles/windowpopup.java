package Autoitfiles;   //used to browse d file using actIT and sciTE 


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowpopup

{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/Autoitfile.html");
		WebElement ele=driver.findElement(By.id("a1"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\sneha\\OneDrive\\Desktop\\Autofiles\\openfil.exe");
	}
	
	

}
