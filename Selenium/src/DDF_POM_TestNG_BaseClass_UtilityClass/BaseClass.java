package DDF_POM_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	static WebDriver driver;
	public static void OpenBrowser() throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins-*");
        
        //Handling of Notifications
        option.addArguments("--disable-notification");
        
		driver = new ChromeDriver();
		
		driver.navigate().to(UtilityClass.getPropertyFileData("URL"));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}
}
