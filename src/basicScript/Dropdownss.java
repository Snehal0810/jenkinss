package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownss {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/dropdwn.html");
		WebElement ele=driver.findElement(By.id("firstdropdown"));
		Select s=new Select(ele);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("j");
		Thread.sleep(1000);
		s.selectByVisibleText("Cake");
		s.deselectAll();
		Thread.sleep(1000);
		
		if(s.isMultiple())
		{
			System.out.println("multi slected dd");
		}
		else
		{ 
			System.out.println("single dd");
		}

	}

}
