package Locator_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Opening of Browser -
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//Upcasting
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver.get("https://www.facebook.com/");
		
		//1. Username -
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("PoojaShinde");
		Thread.sleep(2000);
		
		//2. Password -
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		Thread.sleep(2000);
		
		//3. LogIn -
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
