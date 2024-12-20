package basicScript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monthreversearr {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		ArrayList<String> l=new ArrayList<String>();
		List<WebElement> opt=s.getOptions();
		
		for (WebElement we : opt)
		{
			String text=we.getText();
			l.add(text);
		  
		}
		Collections.sort(l, Collections.reverseOrder());
		//Collections.reverse(l);
		for (String l1 : l)
		{
			System.out.println(l1);		
		}
	}

	}


