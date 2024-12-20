package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swaglab {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).click();
	 
		WebElement ele=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String title=ele.getText();
		System.out.println(title);
		WebElement ele1=driver.findElement(By.xpath("//div[.='$29.99']"));
		String price=ele1.getText();
		System.out.println(price);
		driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		WebElement ele3=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String title1=ele3.getText();
		System.out.println(title1);
		
		WebElement ele4=driver.findElement(By.xpath("//div[.='29.99']"));
		String price1=ele4.getText();
		System.out.println(price1);
		
		if(title==title1)
		{
			System.out.println("same Title");
		}
		else
		{
			System.out.println("not same");
		}
		 if(price==price1)
		{
			System.out.println("price same");
		}
		else
		{
			System.out.println("price not same");
		}
		 driver.findElement(By.xpath("//a[.'CHECKOUT']")).click();
		
	}

}
