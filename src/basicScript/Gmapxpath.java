package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmapxpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
        driver.findElement(By.xpath("//div[@id='sb_ifc50']")).sendKeys("Bangalore,karnataka");
        driver.findElement(By.xpath("//div[@id='sb_ifc51']")).sendKeys("Mysuru,Karnataka");
        driver.findElement(By.xpath("//button[@data-tooltip='search']and //button[@class='mL3xi']")).click();
        driver.quit();
	}

}
