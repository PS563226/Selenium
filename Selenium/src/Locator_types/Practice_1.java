package Locator_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//1. Username -
		driver.findElement(By.tagName("input")).sendKeys("_pooja_as23");
		Thread.sleep(2000);

		//2. Password -
		driver.findElement(By.name("password")).sendKeys("Karanbg@2303");
		Thread.sleep(2000);
		
		//3. LogIn -
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(9000);
		
		driver.close();

	}
}
