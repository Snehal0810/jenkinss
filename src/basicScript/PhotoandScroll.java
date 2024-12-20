package basicScript;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class PhotoandScroll {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.com");
		
		
		WebElement ele=driver.findElement(By.xpath("//a[.='Careers']"));
	    Point p=ele.getLocation();
		int y=p.getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		
		String photo="./Photo/";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) ele;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+"abcd.jpeg");
		FileHandler.copy(src, dst);
		
		js.executeScript("window.scrollBy(0,-"+y+")");
		WebElement ele1=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		TakesScreenshot tss=(TakesScreenshot) ele1;
		File src1 = tss.getScreenshotAs(OutputType.FILE);
		File dst1=new File(photo+d2+"eee.jpeg");
		FileHandler.copy(src1, dst1);
	}

}
