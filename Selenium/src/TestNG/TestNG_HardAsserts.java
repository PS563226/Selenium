package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_HardAsserts {

	//Hard Asserts
	
	//1. assertEquals
	@Test
	public void Test1() {
		Reporter.log("Running Test1 method", true);
		String expResult = "Good Night";
		String actResult = "Good Night";
		
		Assert.assertEquals(actResult, expResult, "Actual and Expected Reults is not equal");
	}
	
	//2. assertNotEquals
	@Test
	public void Test2() {
		Reporter.log("Running Test2 method", true);
		String expResult = "Good Night";
		String actResult = "Good Night1";
		
		Assert.assertNotEquals(actResult, expResult, "Actual and Expected Results is equal");
	}
	
	//3. assertTrue
	@Test
	public void Test3() {
		Reporter.log("Running Test3 method", true);
		boolean Result = true;
		
		Assert.assertTrue(Result, "Result is False" );
	}
	
	//4. assertFalse
	
	@Test
	public void Test4() {
		Reporter.log("Running Test4 method", true);
		boolean Result = false;
		
		Assert.assertFalse(Result, "Result is True");
	}
	
	//5. assertNull
	
		@Test
		public void Test5() {
			Reporter.log("Running Test5 method", true);
			String Result = null;
			
			Assert.assertNull(Result, "Result is not Null");
	}
		
		// 6. assertNotNull
		@Test
		public void test6() {
			Reporter.log("running test6 method", true);
			String result = "quantum";

			Assert.assertNotNull(result, "result is null");

	}
		
		// 7. assertFail
		@Test
		public void test7() {
			Reporter.log("running test7 method", true);
			Assert.fail();

	}
}
