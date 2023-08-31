package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_1_getStringData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//A FileInputStream obtains input bytes from a file in a file system.
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//1. getStringCellValue() - String, Char
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);//Quantum Academy
		
		String data2 = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data2);//A
		
		double data3 = sh.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data3);//100.0
		
		//explicit casting
		int d3 = (int)data3;
		System.out.println(d3);//100
		
		//3.getBooleanCellValue()
		boolean data4 = sh.getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data4);//true
		
		String data5 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data5);//ABC100

		String data6 = sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data6);//200
		
		String data7 = sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println(data7);//300
		
		//4. getLastRowNum() - used to identify row size
		int rowSize = sh.getLastRowNum();//counts row from 0th index
		System.out.println(rowSize);//2
		System.out.println(rowSize+1);//3, actual row size = rowSize(getLastRowNum())+1
		
		//5. getLastCellNum() - used to identify cell size
		short cellSize = sh.getRow(2).getLastCellNum();//cell size = no. of values present in specific row
		System.out.println(cellSize);//1
		
	}
}
