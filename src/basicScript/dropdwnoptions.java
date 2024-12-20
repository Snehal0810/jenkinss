package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdwnoptions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("select3"));
		Select s=new Select(ele);
		Thread.sleep(1000);
		s.selectByValue("Canada");
		//s.deselectAll();
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(1000);
		WebElement elem=driver.findElement(By.id("select-multiple-native"));
		Select s1=new Select(elem);
		Thread.sleep(1000);
		s1.selectByIndex(1);
		
		s1.selectByIndex(2);
		
	
	}

}
