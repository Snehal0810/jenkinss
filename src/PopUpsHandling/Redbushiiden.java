package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbushiiden {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMIl4zLuarqiQMVczODAx2X5SHEEAAYASAAEgIp_PD_BwE");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='21 Nov']")).click();

	}

}
