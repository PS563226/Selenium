package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignOut {

	public class GitHub_SignOutPage {

		//1. Declaration
			@FindBy(xpath="//span[contains(text(),'Sign out')]") private WebElement SignOut;
				
		//2. Initialization 
			public GitHub_SignOutPage(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
				
		//3. Usage
			public void clickGitHub_SignOutPage() {
					SignOut.click();
				}
		}

	public void clickGitHub_SignOut() {
		// TODO Auto-generated method stub
		
	}

}
