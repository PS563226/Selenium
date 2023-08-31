package DDF_POM_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_LogIn {
	
	@FindBy(xpath="//input[@name='login']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//input[@type='submit']") private WebElement Login;
	
	public GitHub_LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setGitHub_LogInUN(String UN) {
		Username.sendKeys(UN);
	}
	
	public void setGitHub_LogInPW(String PW) {
		Password.sendKeys(PW);
	}
	
	public void clickGitHub_LogInButton() {
		Login.click();
	}
}
