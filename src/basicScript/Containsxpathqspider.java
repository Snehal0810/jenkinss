//Qspider demoapp site
package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Containsxpathqspider {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Snehal");
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='attended']")).click();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='inline-flex items-center cursor-pointer']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
