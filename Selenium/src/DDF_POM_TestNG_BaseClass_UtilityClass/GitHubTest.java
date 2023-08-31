package DDF_POM_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass{//Inheritance Used

	GitHub_SignIn Signin;
	GitHub_LogIn Login;
	GitHub_Home HomePage;
	GitHub_SignOut Signout;
	
	@BeforeClass
	public void BrowserOpen() throws InterruptedException, IOException {
		OpenBrowser();
		Signin = new GitHub_SignIn(driver);
		Login = new GitHub_LogIn(driver);
		HomePage = new GitHub_Home(driver);
		Signout = new GitHub_SignOut(driver);
}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		Signin.clickGitHub_SignInButton();
		Login.setGitHub_LogInUN(UtilityClass.getTestData(0, 0));
		Login.setGitHub_LogInPW(UtilityClass.getTestData(0, 1));
		Login.clickGitHub_LogInButton();
		Thread.sleep(2000);
		
		HomePage.clickGitHubHomeButton();
	}
	
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException {
		String expResult = UtilityClass.getTestData(0, 2);
		String actResult = HomePage.verifyGitHubHomeUsername();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(actResult, expResult, "act and exp results is different");
	}
	
	// ITestResult - listener, this class describes the result of a test
	@AfterMethod
	public void logout(ITestResult result) throws InterruptedException, IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID = 100;
			UtilityClass.captureScreenshot(driver, TCID);
		}
		Signout.clickGitHub_SignOutButton();
		
		Thread.sleep(2000);
	}
	
    @AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	
	
}
