package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickhold {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement ele=driver.findElement(By.id("circle"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();

	}

}
