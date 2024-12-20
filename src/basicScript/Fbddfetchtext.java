package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbddfetchtext {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("year"));
		Select s=new Select(ele);
		Thread.sleep(1000);
	    List<WebElement> l=s.getOptions();
	     for (WebElement we : l)
	     {
	    	 System.out.println(we.getText());
		}  
	    
	    

	}

}
