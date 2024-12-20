package basicScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 
{
	public static void main(String[] args) {
		
	
	String key="webdriver.chrome.driver";
	String value="./Software/Chromedriver.exe";
	System.setProperty(key,value);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
}
