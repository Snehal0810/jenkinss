package Synchronizationss;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitdemo {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.findElement(By.xpath("//input[@class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600"
				+ " focus:border-primary-600 block w-1/3 p-2.5 dark:placeholder-gray-400 focus:bg-[rgb(240,240,240)]']")).sendKeys("2");
		driver.findElement(By.xpath("//button[.='Start']")).click();
        WebElement ele=driver.findElement(By.xpath("//p[.='Do you like Automation']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		String photo="./Photo/";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)ele;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dsc=new File(photo+d2+"elemetpic.jpeg");
		FileHandler.copy(src, dsc);
	}

}
