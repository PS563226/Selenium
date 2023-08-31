package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_3_PrintCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowSize = sh.getLastRowNum();
		
		for(int i=0; i<=rowSize; i++) {
			double data = sh.getRow(i).getCell(4).getNumericCellValue();
			System.out.println(data);
		}
	}
}
