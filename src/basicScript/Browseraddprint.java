package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browseraddprint {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String add = driver.getWindowHandle();
		System.out.println(add);
	

	}

}
