package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GitHub_Login {

	@Parameters({"username", "password"})
	@Test
	public void LoginGitHub() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\New\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
