package Browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notificationpopup
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("__disable__notification");
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("https://www.facebook.com/");
		
	}

}
