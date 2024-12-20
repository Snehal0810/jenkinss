package basicScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closechildbro {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		String P_id=driver.getWindowHandle();//to get parent address only
		Set<String> allwh=driver.getWindowHandles();
		System.out.println(allwh.size());// count browser size
		
		allwh.remove(P_id);
	    System.out.println(allwh.size());	
	 
		Thread.sleep(2000);
		for (String st : allwh)
		{
			driver.switchTo().window(st);
		
			driver.close();
			
		}

	}

}
