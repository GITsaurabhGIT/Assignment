package TestScenario;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFileWithJavaPOI {
    public static void main(String[] args) /*throws WriteException*/ {
        try {
            //define a workbook
            Workbook wb = new HSSFWorkbook();
            //define output file
            FileOutputStream fileOut = new FileOutputStream("excel.xls");
            //add a sheet to the workbook
            Sheet sheet = wb.createSheet("Contact_Info");
            // Create a row and put some cells in it. Rows are 0 based.
            //define first row
            Row row0 = sheet.createRow((short)0);
            // Create a cell and put a value in it.
            Cell cell = row0.createCell(0);
            cell.setCellValue("TestId");
            //add more cells and values
            row0.createCell(1).setCellValue("TestName");
            row0.createCell(2).setCellValue("TestModule");
            row0.createCell(3).setCellValue("TestType");
            row0.createCell(4).setCellValue("TestSteps");
            row0.createCell(5).setCellValue("Action");
            row0.createCell(6).setCellValue("TestResult");
            row0.createCell(7).setCellValue("Note");
            //add row 1 content
            Row row1=sheet.createRow((short)1);
            row1.createCell(0).setCellValue("1");
            row1.createCell(1).setCellValue("Login");
            row1.createCell(2).setCellValue("Dashboard");
            row1.createCell(3).setCellValue("Regression");
            row1.createCell(4).setCellValue("1");
            row1.createCell(5).setCellValue("Open Browser");
            row1.createCell(6).setCellValue("Browser Should Open");
            row1.createCell(7).setCellValue("This is a note");
            // All sheets and cells added. Now write out the workbook
            wb.write(fileOut);
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
