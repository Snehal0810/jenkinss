package basicScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./Software/Chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
		
		String key1="webdriver.gecko.driver";
		String value1="./Software/geckodriver.exe";
		System.setProperty(key1,value1);
		FirefoxDriver drivers=new FirefoxDriver();

	}

}
