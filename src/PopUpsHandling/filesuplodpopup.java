package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filesuplodpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("file"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\sneha\\OneDrive\\Desktop\\Snehal Thorat-CV-2022.docx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Custom Button']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//div[.='Upload File']"));
		//Thread.sleep(2000);
		ele1.sendKeys("C:\\Users\\sneha\\OneDrive\\Desktop\\Facebookcredintial.xlsx");
		Thread.sleep(2000);
		//driver.close();
	}

}
