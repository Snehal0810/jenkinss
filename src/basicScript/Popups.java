package basicScript;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups {

	private static final int String = 0;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		WebElement ele1=driver.findElement(By.xpath("//a[.='New Window']"));
		ele1.click();
		
		WebElement ele5=driver.findElement(By.xpath("//a[.='Open in new window']"));
		 ele5.click();
		 
	   //switch control
				
		Set<String> allwh = driver.getWindowHandles();
		 ArrayList<String> l1=new ArrayList<String>(allwh);
		 String p_id=driver.getWindowHandle();
		  for (String st : l1)
		  {
			  driver.switchTo().window(st);
    		}
		    Thread.sleep(2000);
			  driver.findElement(By.id("email")).sendKeys("abcd");
			  Thread.sleep(2000);
			driver.close();
	   //switch control back to parent
			  driver.switchTo().window(p_id);
			  
// new tab option		 
		WebElement ele2=driver.findElement(By.xpath("//a[.='New Tab']"));
		 ele2.click();  
		 Thread.sleep(2000);
		WebElement ele6=driver.findElement(By.xpath("//button[.='Open window in new Tab']"));
		 ele6.click();
		 Thread.sleep(2000);
		//switch control to new window
		 Set<String> allwh1=driver.getWindowHandles();
		 ArrayList<String> l2=new ArrayList<String>(allwh1);
		 for (String st1 : l2)
		 {
		   driver.switchTo().window(st1);	
		}
		 Thread.sleep(2000);
		  driver.findElement(By.id("email")).sendKeys("ssss");
		  Thread.sleep(2000);
		  driver.close();
//switch to parent again  
		  driver.switchTo().window(p_id);
		  
// Multiple option
		WebElement  ele3=driver.findElement(By.xpath("//a[.='Multiple Windows']"));
	    ele3.click();
	    Thread.sleep(1000);
	    WebElement ele7=driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']"));
		 ele7.click();
		Thread.sleep(2000);
		//switch to new tab
	   Set<String> allwh2 = driver.getWindowHandles();	
	   ArrayList<String> l3=new ArrayList<String>(allwh2);
	   for (String st2 : l3)
	   {
		driver.switchTo().window(st2);
		}
	   Thread.sleep(3000);
	   driver.close();
//switch to parent again  
		  driver.switchTo().window(p_id);
	   
//multiple tab 	   
		WebElement ele4=driver.findElement(By.xpath("//a[.='Multiple Tabs']"));
	    ele4.click();  
	    WebElement ele8=driver.findElement(By.xpath("//button[.='Click to open multiple tabs']"));
	    ele8.click();
	    Thread.sleep(2000);
	//switch controls  
	      Set<String> allwh3 = driver.getWindowHandles();	
		   ArrayList<String> l4=new ArrayList<String>(allwh3);
		   for (String st3 : l4)
		   {
			driver.switchTo().window(st3);
			}
		   Thread.sleep(2000);
		   driver.close();
//switch to parent again  
			  driver.switchTo().window(p_id);
		   
	    
		
		
	}

}
