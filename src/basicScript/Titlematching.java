package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Titlematching
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	  String title=driver.getTitle();
	  
	  if(title.equals("hello facebbok"))
	  {
	   System.out.println("matching title");
	}
	  else
	  {
		  System.out.println("not match");
	  }
	  Thread.sleep(2000);
	}
}

