package basicScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/results?search_query=kantara+movie");
		Thread.sleep(1000);
		//st 1
		TakesScreenshot ts=(TakesScreenshot)driver;
		//st 2
		File src=ts.getScreenshotAs(OutputType.FILE);
		//st 3
		File dst=new File("D:\\screenshot/test.jpeg");   
		//st 4
		FileHandler.copy(src, dst);

	}

}
