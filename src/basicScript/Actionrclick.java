package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionrclick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu");
		WebElement ele=driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();


	}

}
