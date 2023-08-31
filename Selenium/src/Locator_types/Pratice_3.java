package Locator_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice_3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//1. Xpath by Attribute 
		// Username
		driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("_pooja_as23");
		Thread.sleep(2000);
		
		// Password
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("Karanbg@2303");
		Thread.sleep(2000);
		
		// LogIn
		//driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]")).click();
		//Thread.sleep(2000);
		
		//2. Xpath by Text -
		// Only Text is used from HTML.
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pooja Shinde");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456789");
		//Thread.sleep(2000);
		
		//3 Xpath by Contains -
		// Only Text is used from HTML.
		//driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		//Thread.sleep(2000);
		
		//driver.close();
		
		//4. Xpath by Index
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'] [1]")).sendKeys("Pooja Shinde");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
