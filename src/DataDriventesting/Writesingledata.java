package DataDriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writesingledata {

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Automation");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("automationclass");
		FileOutputStream fis=new FileOutputStream("./Testdata/Writedata.xlsx");
		book.write(fis);
		book.close();
		fis.close();

	}

}
