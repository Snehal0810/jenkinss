package PomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Refreshdata 
{
	@FindBy(id="email")
	private WebElement Uname;
	
	public Refreshdata(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void passdata()
	{
		Uname.sendKeys("Admin");
	}
	

}
