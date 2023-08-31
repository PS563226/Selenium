package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	//1. Declaration We have to follow Syntax @FindBy(LocatorType) AccessSpecifier WrittenType of Variable;
	//SignIn - Data Member
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SignIn;
	//@FindBy = annotation
	//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	
	//2. Initialization - initElement converts @FindElement into driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	public GitHub_SignIn(WebDriver driver) {//We use constructor
		PageFactory.initElements(driver, this);
	}
	//3. Usage
	public void clickGitHub_SignInBtn() {
		SignIn.click();
		
	}
}
