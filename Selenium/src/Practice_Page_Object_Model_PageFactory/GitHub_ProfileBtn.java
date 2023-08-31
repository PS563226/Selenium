package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_ProfileBtn {

	//1. Declaration
	
	@FindBy(xpath="(//span[@class='Button-label'])[3]") private WebElement Profile;
	
	//2. Initialization
	
	public GitHub_ProfileBtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	
	public void clickGitHub_ProfileBtn() {
		Profile.click();
	}
	
}
