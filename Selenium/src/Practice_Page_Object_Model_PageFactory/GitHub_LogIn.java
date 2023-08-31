package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_LogIn {

	//1. Declaration
	
	@FindBy(xpath="//input[@name='login']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//input[@type='submit']") private WebElement Login;
	
	//2. Initialization
	
	public GitHub_LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	
	public void setGitHub_LogInUN() {
		Username.sendKeys("PS563226");
	}
	
	public void setGitHub_LogInPW() {
		Password.sendKeys("Poojas@2303");
	}
	
	public void clickGitHub_LogInButton() {
		Login.click();
	}
}
