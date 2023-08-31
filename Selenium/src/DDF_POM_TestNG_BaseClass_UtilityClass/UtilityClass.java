package DDF_POM_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {//When we have to call multiple methods then we declare method as static 
	//and call it through class name and we declare it non static then every time we have to create 
	//object of Utility Class.
    //Simple if one method is called multiple time declare it static and call it through class name.
	
	//1. Parameterization
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Pooja Shinde\\\\Videos\\\\Software Testing\\\\Quantum\\\\Excel Sheets\\\\Excel 1.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("GitHub Data");
		String Value = Sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return Value;
	}
	
	//We capture scrrenshot of fail test case only.
	//So this is also used multiple times so declare it static method.
	
	//2. Screenshot Capturing
	
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Src);//C:\Users\POOJAS~1\AppData\Local\Temp\screenshot1721224587726866103.png
		File destination = new File("C:\\Users\\Pooja Shinde\\eclipse-workspace\\Selenium\\Screenshots\\GitHub"+TCID+".png");
		FileHandler.copy(Src, destination);
		//We need to cast driver into TakesScreenshot interface convert means
		//driver is a browser when it opens Screenshot gets active.
	}
	
	//3. To read data from .properties file
	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\GitHub.properties");//System.getProperty("user.dir") is in built path for GitHub.properties.
		obj.load(file);//Load copies file properties and save it in obj.
		String Value = obj.getProperty(key);
		return Value;
		
	}

}
