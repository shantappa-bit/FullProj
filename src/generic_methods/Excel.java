package generic_methods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excel implements framework_constants
{
	public static String getdata(String sheetname,int rownum,int cellnum)
	{
		String value="";
		try
		{
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		 Workbook wb = WorkbookFactory.create(fis);
		 Cell c = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		 value=c.toString();
		 //11 13 15
		}
		catch(Exception e1)
		{
			
		}
		return value;
	}

}
