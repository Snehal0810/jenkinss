package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoologin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("thoaansh@gmail.com");
		driver.findElement(By.name("signin")).click();
		driver.findElement(By.xpath("//button[.='Try signing in another way']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.name("signin")).click();
		//WebElement ele=driver.findElement(By.name("mm"));
		//Select s=new Select(ele);
		//Thread.sleep(1000);
		//s.selectByVisibleText("November");
		//driver.findElement(By.name("dd")).sendKeys("2");
		//driver.findElement(By.name("yyyy")).sendKeys("2000");
		//Thread.sleep(2000);
		//driver.findElement(By.name("signup")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.name("phone")).sendKeys("9421903533");
		//Thread.sleep(1000);
		//driver.findElement(By.name("smscode")).click();
		//driver.findElement(By.)
	}

}
