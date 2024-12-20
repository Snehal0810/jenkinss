package DataDriventesting;

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

public class Writeflipkartlink {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		 int nooflink=links.size();
		 
		 XSSFWorkbook book=new XSSFWorkbook();
		 XSSFSheet sheet=book.createSheet("flipkartlinks");
		 
		 for(int i=0;i<nooflink;i++)
		 {
			 WebElement link=links.get(i);
			 String url=link.getAttribute("href");
			 XSSFRow row=sheet.createRow(i);
			 XSSFCell cel=row.createCell(0);
			 cel.setCellValue(url);
			 
		 }
		 FileOutputStream fis=new FileOutputStream("./Testdata/flipkartlink.xlsx");
		 book.write(fis);
		 book.close();
		 fis.close();
		 
	}

}
