package Locator_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//1. Xpath by Attribute -
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("QA@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
		
		Thread.sleep(2000);
		
		//2. Xpath by Text
		
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(2000);
		
		//3. Xpath by Contains
		
		//driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		Thread.sleep(2000);
		
		//4. Xpath by Index
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'] [1]")).sendKeys("Pooja Shinde");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'] [2]")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
