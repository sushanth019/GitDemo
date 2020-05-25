package excelDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C://Users//sushanth//Desktop//Sushanth//demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		int sheetNumber = workbook.getNumberOfSheets();
		for(int i=1; i<= sheetNumber;i++)
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				{
					XSSFSheet sheet = workbook.getSheetAt(i);
				}
			}

	}

}
