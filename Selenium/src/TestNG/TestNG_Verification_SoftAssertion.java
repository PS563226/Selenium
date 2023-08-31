package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssertion {

	@Test
	public void Test() {
		String expResult = "Good Morning";
		String actResult = "Good Night";
		boolean Result = false;
		
		//To overcome Disadvantage of Hard Assert(static method is used) we use Soft Assert(Non Static Method by creating object)
		SoftAssert soft = new SoftAssert();
	    
		//1. Verification 1
		soft.assertNotEquals(actResult, expResult, "Verification 1 : act and exp is equal");
		
		//2. Verification 2
		soft.assertEquals(actResult, expResult, "Verification 2 : act and exp is not equal");
		
		//3. Verification 3
		soft.assertTrue(Result, "Verifiaction 3 : Result is False");
		
		soft.assertAll();
		
		//java.lang.AssertionError: The following asserts failed:
		//Verification 2 : act and exp is not equal expected [Good Morning] but found [Good Night],
		//Verifiaction 3 : Result is False expected [true] but found [false]
	}
}
