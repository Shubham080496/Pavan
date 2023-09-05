package day38;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file--WorkBook--Sheet--Rows--Cells

public class WritingDataIntoExcelDynamically {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile1.xlsx");
		
	
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("myData");
		
		
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<=3;r++)
		{
			XSSFRow newRow=sheet.createRow(r);
						
			for(int c=0;c<2;c++)
			{
				System.out.println("Enter data:");
				newRow.createCell(c).setCellValue(sc.next());
			}
		}
					
				
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Done!!!!!!");
	}

}
