package Locator_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.get("file:///C:/Users/Pooja%20Shinde/Videos/Software%20Testing/Quantum/HTML/Login%20Page.html");
		
		Thread.sleep(2000);
		
		//1. tagName -
		driver.findElement(By.tagName("input")).sendKeys("QA@gmail.com");
		
		Thread.sleep(2000);
		
		//2. id - attribute value is used
		driver.findElement(By.id("1234567")).sendKeys("QA@2023");
		
		Thread.sleep(2000);
		
		//3. name -
		driver.findElement(By.name("abc")).sendKeys("QA@gmail.com");
		
		Thread.sleep(2000);
		
		//4. className -
		driver.findElement(By.className("Class123")).sendKeys("123456789");
		
		Thread.sleep(2000);
		
		//5. LinkText
		//driver.findElement(By.linkText("Link1")).click();
		
		//6. partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
