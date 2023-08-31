package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pratice5_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		double Number1 = Sh.getRow(0).getCell(4).getNumericCellValue();
		System.out.println(Number1);
		
		double Number2 = Sh.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(Number2);
		
		double Number3 = Sh.getRow(2).getCell(4).getNumericCellValue();
		System.out.println(Number3);
		
		double Number4 = Sh.getRow(3).getCell(4).getNumericCellValue();
		System.out.println(Number4);
		
		double Number5 = Sh.getRow(4).getCell(4).getNumericCellValue();
		System.out.println(Number5);
	}
}
