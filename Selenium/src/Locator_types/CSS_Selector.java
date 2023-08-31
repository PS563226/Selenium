package Locator_types;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();//upcasting
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("QA@gmail.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("button[value='1']")).click();
			
			Thread.sleep(2000);
			
			driver.close();
	}
}
