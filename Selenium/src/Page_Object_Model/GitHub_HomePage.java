package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_HomePage {

		//1. Declaration
			@FindBy(xpath="(//span[@class=\"Button-content\"])[3]") private WebElement SignOutButton;
			
		//2. Initialization 
			public GitHub_HomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
		//3. Usage
			public void clickGitHubHomePage() {
				SignOutButton.click();
	}
}
