package Browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Incognitomode
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );

		FirefoxOptions opt=new FirefoxOptions();
		//ChromeOptions opt=new ChromeOptions();
		opt.addArguments("__incognito ");
		//WebDriver driver=new ChromeDriver(opt);
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("https://www.facebook.com/");
		
	}

}
