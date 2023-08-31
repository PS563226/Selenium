package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pratice_2_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		String Data1 = sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(Data1);//Canada
		
		String Data2 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(Data2);//Germany
		
		String Data3 = sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(Data3);//France
		
		String Data4 = sh.getRow(3).getCell(1).getStringCellValue();
		System.out.println(Data4);//Germany
		
		String Data5 = sh.getRow(4).getCell(1).getStringCellValue();
		System.out.println(Data5);//Mexico
	}
}
