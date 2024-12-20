package basicScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshotelement {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement ele=driver.findElement(By.xpath("//a[.='Create a Page']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("D:\\screenshot/test.jpeg");
		FileHandler.copy(src, dst);
	}

}
