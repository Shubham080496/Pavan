package day38;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file--WorkBook--Sheet--Rows--Cells

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
	
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		
				row1.createCell(0).setCellValue("WELCOME");
				row1.createCell(1).setCellValue("SELENIUM");
				row1.createCell(2).setCellValue("AUTOMATION");
		
		XSSFRow row2=sheet.createRow(1);
				
				row2.createCell(0).setCellValue(100);
				row2.createCell(1).setCellValue(200);
				row2.createCell(2).setCellValue(300);
		
				
				
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Done!!!!!!");
	}

}
