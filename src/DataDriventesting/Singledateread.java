package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Singledateread {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Testdata/facebookcredintial.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(0);
		String val=cel.getStringCellValue();
		System.out.println(val);
		workbook.close();
		fis.close();

	}

}
