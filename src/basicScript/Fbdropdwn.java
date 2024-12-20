package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdropdwn {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		Thread.sleep(1000);
	   List<WebElement> l=s.getOptions();//to find how many options in dropdown
	   System.out.println(l.size());

	}

}
