package basicScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.apache.pdfbox.contentstream.operator.state.SetLineWidth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandlemeth {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(1000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
	Set<String> address = driver.getWindowHandles();
	System.out.println(address);
	//driver.switchTo().window("https://www.google.com/");
	int count=address.size();
	System.out.println(count);
     
	}

	
}
