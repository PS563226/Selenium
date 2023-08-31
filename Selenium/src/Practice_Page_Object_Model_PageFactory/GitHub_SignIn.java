package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	//1. Declaration
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SignIn;
	
	//2. Initialization
	
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	
	public void clickGitHub_SignInButton() {
		SignIn.click();
	}
}