package DDF_POM_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignOut {
	
	@FindBy(xpath="//span[contains(text(),'Sign out')]") private WebElement SignOut;
	
	public GitHub_SignOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHub_SignOutButton() {
		SignOut.click();
	}
}
