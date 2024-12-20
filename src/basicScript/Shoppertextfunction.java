package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shoppertextfunction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.shoppersstack.com");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='100% Natural Premium| Premium Badam...']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='manyavar']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Sk@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		Thread.sleep(7000);
		driver.quit();
	}

}
