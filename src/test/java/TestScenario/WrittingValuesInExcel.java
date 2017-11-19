package TestScenario;

/*import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingValuesInExcel {
	
	public void writeDataIntoExcel(File file_path,String Sheetname,String value,String idVal) throws IOException
	{	       
			try {
				FileInputStream input = new FileInputStream(file_path);
			
	                
	        XSSFWorkbook wb=new XSSFWorkbook(input);
	        
	        XSSFSheet sh = wb.getSheet(Sheetname);
	        
	        XSSFRow row = sh.createRow(0);
	        XSSFCell cell = row.createCell(0);
	        cell.setCellValue(value);
	        
	        XSSFRow row1 = sh.createRow(5);	        
	        XSSFCell cell1 = row.createCell(5);	        
	        cell1.setCellValue(idVal);
	        
	        FileOutputStream output = new FileOutputStream(file_path);
	        
	        wb.write(output);
	        
	        wb.close();
	        
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	}	
}