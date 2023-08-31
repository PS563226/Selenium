package DDF_POM_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Home {

	@FindBy(xpath="(//span[@class='Button-content'])[3]") private WebElement ProfileButton;
	@FindBy(xpath="(//span[contains(text(),'PS563226')])[1]") private WebElement Username;
	
	public GitHub_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubHomeButton() throws InterruptedException {
		ProfileButton.click();
		Thread.sleep(4000);
	}
	public String verifyGitHubHomeUsername() {
		String actResult = Username.getText();
		return actResult;	
	}
	
}
