package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pratice_3_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		Cell Data1 = Sh.getRow(0).getCell(2);
		System.out.println(Data1);
		
		Cell Data2 = Sh.getRow(1).getCell(2);
		System.out.println(Data2);
		
		Cell Data3 = Sh.getRow(2).getCell(2);
		System.out.println(Data3);
		
		Cell Data4 = Sh.getRow(3).getCell(2);
		System.out.println(Data4);
		
		Cell Data5 = Sh.getRow(4).getCell(2);
		System.out.println(Data5);
	}
}
