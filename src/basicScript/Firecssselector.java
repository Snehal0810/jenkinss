package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firecssselector 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/results?search_query=stree+trailer");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("stree trailer");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();

	}

}
