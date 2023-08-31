package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pratice6_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		String Month1 = Sh.getRow(0).getCell(5).getStringCellValue();
		System.out.println(Month1);
		
		String Month2 = Sh.getRow(1).getCell(5).getStringCellValue();
		System.out.println(Month2);
		
		String Month3 = Sh.getRow(2).getCell(5).getStringCellValue();
		System.out.println(Month3);
		
		String Month4 = Sh.getRow(3).getCell(5).getStringCellValue();
		System.out.println(Month4);
		
		String Month5 = Sh.getRow(4).getCell(5).getStringCellValue();
		System.out.println(Month5);
	}
}
