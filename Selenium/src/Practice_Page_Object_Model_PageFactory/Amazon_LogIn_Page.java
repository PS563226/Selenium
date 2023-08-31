package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LogIn_Page {

	//1. Declaration
	
	@FindBy(xpath="//input[@type='email']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//input[@id='signInSubmit']") private WebElement SignIn;
	
	//2. Initialization
	
	public Amazon_LogIn_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	
	public void setAmazon_LogIn_PageUsername() {
		Username.sendKeys("karan140897@gmail.com");
	}
	
	public void setAmazon_LogIn_PagePassword() {
		Password.sendKeys("Amazon@987");
	}
	
	public void clickAmazon_LogIn_PageSignIn() {
		SignIn.click();
	}
}
