package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbloginread {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		FileInputStream fis=new FileInputStream("./Testdata/facebookcredintial.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(0);
		XSSFCell cel1=row.getCell(1);
		String val1=cel1.getStringCellValue();
		String val=cel.getStringCellValue();
		System.out.println(val);
		
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys(val);
		WebElement ele1 = driver.findElement(By.id("pass"));
		ele1.sendKeys(val1);
		
		workbook.close();
		fis.close();

	}

}
