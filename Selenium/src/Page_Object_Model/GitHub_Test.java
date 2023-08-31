package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page_Object_Model.GitHub_HomePage;
import Page_Object_Model.GitHub_Login;
import Page_Object_Model.GitHub_SignIn;
import Page_Object_Model.GitHub_SignOut;

public class GitHub_Test {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.navigate().to("https://github.com/");
		
		Thread.sleep(2000);
		
		GitHub_SignIn signin = new GitHub_SignIn(driver);
		signin.clickGitHub_SignInBtn();
		
		Thread.sleep(2000);
		
		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUsername();
		login.setGitHubLoginPassword();
		login.clickGitHub_LoginBtn();
		
		Thread.sleep(2000);
		
		GitHub_HomePage home = new GitHub_HomePage(driver);
		home.clickGitHubHomePage();
		
		Thread.sleep(2000);

		GitHub_SignOut signout = new GitHub_SignOut();
		signout.clickGitHub_SignOut();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
