package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login {

	//1. Declaration
		@FindBy(xpath="//input[@id='login_field']") private WebElement Username;
		@FindBy(xpath="//input[@type='password']") private WebElement Password;
		@FindBy(xpath="//input[@type='submit']") private WebElement Login;
		
		//2. Initialization 
		public GitHub_Login(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//3. Usage
		public void setGitHubLoginUsername() {
			Username.sendKeys("PS563226");
		}
		public void setGitHubLoginPassword() {
			Password.sendKeys("Poojas@2303");
		}
		public void clickGitHub_LoginBtn() {
			Login.click();
		}
}
