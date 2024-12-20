package DataDriventesting;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readmultipledata {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Testdata/facebookcredintial.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int lr=sheet.getLastRowNum();
		 
		for(int i=0;i<lr;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cel = row.getCell(0);
			String cel1 = cel.getStringCellValue();
			
			XSSFCell cell = row.getCell(1);
			String cel2 = cell.getStringCellValue();
			
			System.out.println(cel1+" "+" "+cel2);
		}
	workbook.close();
	fis.close();
      
	}

}
