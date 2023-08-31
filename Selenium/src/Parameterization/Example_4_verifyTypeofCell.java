package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_4_verifyTypeofCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		CellType CT = sh.getRow(0).getCell(0).getCellType();
		System.out.println(CT);//STRING, NUMERIC, BOOLEAN
	}
}
