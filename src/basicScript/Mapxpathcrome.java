package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mapxpathcrome {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/maps");
		
		driver.findElement(By.xpath("//button[@class='hArJGc vF7Cdb']")).click();
		driver.findElement(By.xpath("//div[@class='gstl_50 sbib_a']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
	}

}
