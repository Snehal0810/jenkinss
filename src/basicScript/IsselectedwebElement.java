package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsselectedwebElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
		Thread.sleep(2000);
	   WebElement ele=driver.findElement(By.id("domain1"));
		boolean b=ele.isSelected();
		if(b)
		{
			System.out.println("select element");
		}
		else
		{
			System.out.println("not selected");
		}

	}

}
