package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeFB {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("wedriver.edge.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\edgedriver_win64\\edgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(40000);
		
		driver.close();
	}
}
