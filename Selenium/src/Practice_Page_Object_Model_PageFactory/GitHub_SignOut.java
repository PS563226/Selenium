package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignOut {

	//1. Declaration
	
	@FindBy(xpath="//span[contains(text(),'Sign out')]") private WebElement SignOut;
	
	//2 Initialization
	
	public GitHub_SignOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	
	public void clickGitHub_SignOutBtn() {
		SignOut.click();
	}
}
