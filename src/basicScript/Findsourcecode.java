package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findsourcecode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String src=driver.getPageSource();
		System.out.println(src);
        driver.close();
	}

}
