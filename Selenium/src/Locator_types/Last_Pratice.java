package Locator_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Last_Pratice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Shinde\\Videos\\Software Testing\\Quantum\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.linkedin.com/?src=go-pa&trk=sem-ga_campid.14650114788_asid.151761418307_crid.657403558718_kw.linkedin+login_d.c_tid.kwd-12704335873_n.g_mt.e_geo.9303628&mcid=6844056167778418689&cid=&gclid=Cj0KCQjw5f2lBhCkARIsAHeTvlj7Siccma8obitYqp7f0u0nWVQ9F1EGf9v4xI3nlM8NlTqs3WpZ9D0aAoaFEALw_wcB&gclsrc=aw.ds&original_referer=https%3A%2F%2Fwww.google.com%2F");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("ankushps2303@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("poojas@2303");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
