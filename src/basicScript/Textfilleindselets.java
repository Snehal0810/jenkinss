package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textfilleindselets {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/textfieldkeyboaerd.html");
		List<WebElement> txt=driver.findElements(By.xpath("//input"));
		int count=txt.size();
		for(int i=0;i<count;i++)
		{
			WebElement e=txt.get(i);
			e.sendKeys("sneha");
		}
		Thread.sleep(1000);
		for(int j=count-1;j>=0;j--)
		{
			WebElement w=txt.get(j);
			w.clear();
		}
	}

}
