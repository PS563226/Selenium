package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_1_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		//FileInputStream reads data from excel sheet in bytes.
		//FileInputStream class object(file) is created with reference to path of excel.
		
		//To open file we will use create() method from WorkBookFactory class.
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		String Data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data1);//Government
		
		String Data2 = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(Data2);//Government
		
		String Data3 = sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println(Data3);//Midmarket
		
		String Data4 = sh.getRow(3).getCell(0).getStringCellValue();
		System.out.println(Data4);//Midmarket
		
		String Data5 = sh.getRow(4).getCell(0).getStringCellValue();
		System.out.println(Data5);//Midmarket
	}
}
