package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {

	@Parameters("BrowserName")
	@Test
	public void TestCase1(String BrowserName) throws InterruptedException {
		WebDriver driver = null;

		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");

			 driver = new ChromeDriver(option);// upcasting
		} else if (BrowserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\edgedriver_win64\\edgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			options.addArguments("headless");
			
			 driver = new EdgeDriver(options);
		} else if (BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			
			 driver = new FirefoxDriver(options);
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}

