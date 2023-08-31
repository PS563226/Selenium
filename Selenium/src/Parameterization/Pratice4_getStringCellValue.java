package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pratice4_getStringCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\Excel Sheets\\Excel 1.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		LocalDateTime Date1 = Sh.getRow(0).getCell(3).getLocalDateTimeCellValue();
		System.out.println(Date1);
		
		LocalDateTime Date2 = Sh.getRow(1).getCell(3).getLocalDateTimeCellValue();
		System.out.println(Date2);
		
		LocalDateTime Date3 = Sh.getRow(2).getCell(3).getLocalDateTimeCellValue();
		System.out.println(Date3);
		
		LocalDateTime Date4 = Sh.getRow(3).getCell(3).getLocalDateTimeCellValue();
		System.out.println(Date4);
		
		LocalDateTime Date5 = Sh.getRow(4).getCell(3).getLocalDateTimeCellValue();
		System.out.println(Date5);
	}
}
