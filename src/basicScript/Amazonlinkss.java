package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonlinkss {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> lik=driver.findElements(By.xpath("//a"));
		int count=lik.size();
		Thread.sleep(1000);
		for(int i=0;i<count;i++)
		{
			WebElement e=lik.get(i);
		 String ref=e.getAttribute("href");
			System.out.println(ref);
		}

	}

}
