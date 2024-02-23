package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File//Workbook//Sheets//row/Cells

public class ReadingExcel {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream file=new FileInputStream("C:\\Users\\manju\\eclipse-workspace\\TATASV\\TestData\\Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows =sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows); //Total 4 Rows
		System.out.println(totalcells); //Total 5 Cells
		

		for(int r=0; r<5; r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0; c<5; c++)
			
			{
	
				String value=currentrow.getCell(c).toString();
				System.out.print(value+"    ");
											
			}
			
			System.out.println();
			
						
		}
	
	
	}

}
