package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Closing {

	//1. Declaration
	
		@FindBy(xpath="//input[@type='submit']") private WebElement SignOutBtn;
		
		//2 Initialization
		
		public GitHub_Closing(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//3. Usage
		
		public void clickGitHub_ClosingBtn() {
			SignOutBtn.click();
		}
}
