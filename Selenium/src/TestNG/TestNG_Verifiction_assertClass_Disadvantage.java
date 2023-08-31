package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Verifiction_assertClass_Disadvantage {

	//Hard Assert
	@Test
	public void test() {
		Reporter.log("Running Test Method");
		String expResult = "Good Morning";
		String actResult = "Good Night";
		boolean Result = false;
		
		//Verification 1
		Assert.assertEquals(actResult, expResult, "Verification 1 : act and exp result is same");
		
		//Verification 2
		Assert.assertEquals(actResult,expResult, "Verification 2 : act and exp result is not same");
		
		//Verification 3
		Assert.assertTrue(Result, "Verifiaction 3 : Result is False");
		
		//java.lang.AssertionError: Verification 1 : act and exp result is same expected [Good Morning] but found [Good Night]
	}
}
