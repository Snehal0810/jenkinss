package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahooxpaths {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Sneharani");
        driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("kale");
        driver.findElement(By.xpath("//input[@id='usernamereg-userId']")).sendKeys("snehakale0810");
        driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("76543sfd21234");
        driver.findElement(By.xpath("//select[@class=' input-with-icon icon-birthday']")).sendKeys("may");
        driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys("1989");
        driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
        driver.quit();
	}

}
