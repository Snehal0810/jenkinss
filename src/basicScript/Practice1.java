package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch browsers
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Chrome.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();

		
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver drivers=new FirefoxDriver();
		drivers.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title=drivers.getTitle();
		System.out.println(title);
		String url=drivers.getCurrentUrl();
		System.out.println(url);
		String src=drivers.getPageSource();
		System.out.println(src);
		drivers.quit();
	}

}
