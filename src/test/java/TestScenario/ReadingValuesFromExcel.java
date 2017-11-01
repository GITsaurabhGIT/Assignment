package TestScenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingValuesFromExcel {
	
	
	public String excelRead(File file_path,String Sheetname) throws IOException
	{	       
			String value = null;
		
			try {
				
			FileInputStream input = new FileInputStream(file_path);
			
	                
	        XSSFWorkbook wb=new XSSFWorkbook(input);
	        
	        XSSFSheet sh = wb.getSheet(Sheetname);
	        
	        XSSFRow row = sh.getRow(0);
	      
	        XSSFCell cell = row.getCell(0);
	        
	        value = cell.toString();
        
	        wb.close();
	        
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return value;
	       
	}	

}
