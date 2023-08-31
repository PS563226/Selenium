package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_5_PrintAllDataUsingCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0; i<=sh.getLastRowNum(); i++) {//row
			for(int j=0; j<=sh.getRow(i).getLastCellNum()-1; j++) {//cell
				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType CT = cellinfo.getCellType();
				
				if(CT==CellType.STRING) {
					System.out.print(cellinfo.getStringCellValue()+" ");
				} else if (CT==CellType.NUMERIC) {
					System.out.print(cellinfo.getNumericCellValue()+" ");
				} else if (CT==CellType.BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue()+" ");
				}
			}
			System.out.println();
		}
	}
}
