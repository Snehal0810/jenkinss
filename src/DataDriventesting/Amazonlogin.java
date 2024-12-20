package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonlogin {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid."
				+ "net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	//	driver.findElement(By.xpath("//span[.='Sign in']")).click();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("./Testdata/amazonlog.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(0);
		XSSFCell cel1=row.getCell(1);
		String val1=cel1.getStringCellValue();
		String val=cel.getStringCellValue();
		//System.out.println(val);
		
		WebElement ele = driver.findElement(By.id("ap_email"));
		ele.sendKeys(val);
		driver.findElement(By.id("continue")).click();
		WebElement ele1 = driver.findElement(By.id("ap_password"));
		ele1.sendKeys(val1);
		driver.findElement(By.id("signInSubmit")).click();
		workbook.close();
		fis.close();

	}

}
