package basicScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checbxfindeles 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/Checkboxtestcase.html");
		List<WebElement> chk=driver.findElements(By.xpath("//input"));
		int count=chk.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement w=chk.get(i);
			w.click();
		}
		for(int j=count-1;j>=0;j--)
		{
			WebElement e=chk.get(j);
			e.click();
		}
				

	}

}
