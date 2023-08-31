package Practice_Page_Object_Model_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://na.account.amazon.com/ap/signin?ie=UTF8&clientContext=132-5850572-6943913&openid.pape.max_auth_age=0&use_global_authentication=false&enableGlobalAccountCreation=1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&marketPlaceId=ATVPDKIKX0DER&signedMetricIdentifier=pjdsmDnaXhj%2FNbw9hCvWIQvTgX0htu%2BjAbCBVOtDWHM%3D&language=en_IN&pageId=lwa&arb=b09f3bcf-e644-4ffa-b0ed-0c8908e62bd1&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3D4340e11f-4744-46c2-b307-7418317adbe6%26language%3Den_IN&metricIdentifier=amzn1.application.7ff8a2be5dae490b9914b4f430ca5c4c&openid.assoc_handle=amzn_lwa_na&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Amazon_LogIn_Page LogIn = new Amazon_LogIn_Page(driver);
		
		LogIn.setAmazon_LogIn_PageUsername();
		
		Thread.sleep(2000);
		
		LogIn.setAmazon_LogIn_PagePassword();
		
		Thread.sleep(2000);
		
		LogIn.clickAmazon_LogIn_PageSignIn();
		
		Thread.sleep(10000);
		
		driver.close();
		
	}
}
