package PopUpsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoapppopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Default Alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Alert Box']")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		a.accept();
        //confirm option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Confirm']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
    //promt
		
		driver.findElement(By.xpath("//a[.='Prompt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		Alert a2=driver.switchTo().alert();
		a2.sendKeys("yes");
		Thread.sleep(2000);
		a2.accept();
	}

}
