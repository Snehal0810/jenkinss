package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebeleMethods
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
	//	driver.navigate().back();
		Thread.sleep(2000);
		//driver.navigate().forward();
		Thread.sleep(2000);
	//	driver.navigate().refresh();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("name"));
		boolean  b=ele.isDisplayed();
		if(b)
		{
			System.out.println("element is displyed");
		}
		else
		{
			System.out.println("element not present");
		}
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/checkbox");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("domain1"));
		boolean b1=ele1.isSelected();
		if(b1)
		{
			System.out.println("ele selected");
		}
		else
		{
			System.out.println("not selected");
		}
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/checkbox");
		Thread.sleep(2000);
	   WebElement ele3=driver.findElement(By.xpath("//span[text()='Write a script to select Checkbox ?']"));
	   Thread.sleep(2000);
	   String texts=ele3.getText();
	   System.out.println(texts);
	   Thread.sleep(2000);
	   driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	   Thread.sleep(1000);
	   WebElement ele4=driver.findElement(By.xpath("//button[text()='Yes']"));
	   String title=ele4.getAttribute("id");
	   System.out.println(title);
	   Thread.sleep(1000);
	   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	   WebElement ele5=driver.findElement(By.xpath("//label[text()='Name']"));
	   Point p=ele5.getLocation();
	   
		
	}

}
