package basicScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closeparentbrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		String p_id=driver.getWindowHandle();//for parent address
		Set<String> allwh=driver.getWindowHandles();
		System.out.println(allwh.size());// count browser size
		Thread.sleep(2000);
		for (String st : allwh)
		{
			driver.switchTo().window(st);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(st.equals(p_id))
			{
				driver.close();
			}
			
		}
		}

}
