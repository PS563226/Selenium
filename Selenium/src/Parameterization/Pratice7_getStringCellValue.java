package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pratice7_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		String Year1 = Sh.getRow(0).getCell(6).getStringCellValue();
		System.out.println(Year1);
		
		String Year2 = Sh.getRow(1).getCell(6).getStringCellValue();
		System.out.println(Year2);
		
		String Year3 = Sh.getRow(2).getCell(6).getStringCellValue();
		System.out.println(Year3);
		
		String Year4 = Sh.getRow(3).getCell(6).getStringCellValue();
		System.out.println(Year4);
		
		String Year5 = Sh.getRow(4).getCell(6).getStringCellValue();
		System.out.println(Year5);
	}
}
