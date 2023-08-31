package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	@DataProvider(name="Data Provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] {{"Manual Testing"}, {"Automation Testing"}, {"API Testing"}, {"SQL"}, {"Jenkins"}};
	}
	
	@Test(dataProvider = "Data Provider")
	public void Test1(String value) {
		System.out.println(value);
	}
}
//Manual Testing
//Automation Testing
//API Testing
//SQL
//Jenkins