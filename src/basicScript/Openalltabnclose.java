package basicScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Openalltabnclose {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// download option
	   WebElement ele1=	driver.findElement(By.xpath("//span[.='Downloads']"));
	   WebElement ele2=driver.findElement(By.xpath("//span[.='Documentation']"));
	   WebElement ele3=driver.findElement(By.xpath("//span[.='Projects']"));
	   WebElement ele4=driver.findElement(By.xpath("//span[.='Support']"));
	   WebElement ele5=driver.findElement(By.xpath("//span[.='Blog']"));
	   
	   /*
	    //  Documentation option
	   
	   Actions act2=new Actions(driver);
	   act2.contextClick(ele2).perform();
	   Thread.sleep(1000);
	   
	   Robot r2=new Robot();
	   r2.keyPress(KeyEvent.VK_T);
	   r2.keyRelease(KeyEvent.VK_T);
	   
	   //projects option
	   
	   Actions act3=new Actions(driver);
	   act3.contextClick(ele3).perform();
	   Thread.sleep(2000);
	   
	   Robot r3=new Robot();
	   r3.keyPress(KeyEvent.VK_T);
	   r3.keyRelease(KeyEvent.VK_T);
	   
	   //support option
	  
	   Actions act4=new Actions(driver);
	   act4.contextClick(ele4).perform();
	   Thread.sleep(2000);
	   
	   Robot r4=new Robot();
	   r4.keyPress(KeyEvent.VK_T);
	   r4.keyRelease(KeyEvent.VK_T);
	   
	   //Blog option
	   
	   Actions act5=new Actions(driver);
	   act5.contextClick(ele5).perform();
	   Thread.sleep(2000);
	   
	   Robot r5=new Robot();
	   r5.keyPress(KeyEvent.VK_T);
	   r5.keyRelease(KeyEvent.VK_T);
	   
	   //Set<String>allwh=driver.getWindowHandles();
		//  ArrayList<String> l=new ArrayList<String>(allwh);
		//  Thread.sleep(2000);
		  //for (String tabid : l)
		  //{
			//  tabid=l.get(1);
			  //driver.switchTo().window(tabid);
			  //driver.close();
			
		//}*/
		  ArrayList<WebElement> l=new ArrayList<WebElement>();
		  l.add(ele1);
		  l.add(ele2);
		  l.add(ele3);
		  l.add(ele4);
		  l.add(ele5);
		
		  Actions act6=new Actions(driver);
		  Robot r6=new Robot();
		  for (WebElement we : l)
		  {
		      act6.contextClick(we).perform();
		      Thread.sleep(1000);
		      r6.keyPress(KeyEvent.VK_T);
		      r6.keyRelease(KeyEvent.VK_T);
			
		}
		  Set<String>allwh=driver.getWindowHandles();
		  ArrayList<String> l1=new ArrayList<String>(allwh);
		  
		  for (String switchs : l1)
		  {
			 // switchs=l1.get(3);
			 // Thread.sleep(2000);
			  driver.switchTo().window(switchs);
			
		}
		 
	}

}
