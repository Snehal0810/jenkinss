package PopUpsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertnconfirmationss {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("sneha");
		//Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		//Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
		driver.quit();		

	}

}
