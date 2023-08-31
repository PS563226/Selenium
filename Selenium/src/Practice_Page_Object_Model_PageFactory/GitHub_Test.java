package Practice_Page_Object_Model_PageFactory;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHub_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/");
		
		driver.manage().window().maximize();
		
		GitHub_SignIn Signin = new GitHub_SignIn(driver);
		Signin.clickGitHub_SignInButton();
		
		Thread.sleep(2000);
		
		GitHub_LogIn Login = new GitHub_LogIn(driver);
		Login.setGitHub_LogInUN();
		Login.setGitHub_LogInPW();
		Login.clickGitHub_LogInButton();
		
		//1. Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		GitHub_ProfileBtn Profile = new GitHub_ProfileBtn(driver);
		Profile.clickGitHub_ProfileBtn();
		
		//2. Explicit Wait
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(05));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='Button-label'])[3]")));
		
		GitHub_SignOut Signout = new GitHub_SignOut(driver);
		Signout.clickGitHub_SignOutBtn();
		
		//3. Fluent Wait
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
		        .ignoring(NoSuchElementException.class)
		        .pollingEvery(Duration.ofSeconds(5));
		
		GitHub_Closing Close = new GitHub_Closing(driver);
		Close.clickGitHub_ClosingBtn();
		
		driver.close();
	}
}
