package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Group {

	@Test(groups = "Facebook")
	public void TestCase1() {
		Reporter.log("Running Test Case 1", true);
	}
	
	@Test(groups = "Gmail")
	public void TestCase2() {
		Reporter.log("Running Test Case 2", true);
	}
	
	@Test(groups = "Instagram")
	public void TestCase3() {
		Reporter.log("Running Test Case 3", true);
	}
	
	@Test(groups = "Amazon")
	public void TestCase4() {
		Reporter.log("Running Test Case 4", true);
	}
	
	@Test(groups = "Flipkart")
	public void TestCase5() {
		Reporter.log("Running Test Case 5", true);
	}
	
	@Test(groups = "Gmail")
	public void TestCase6() {
		Reporter.log("Running Test Case 6", true);
	}

	@Test(groups = "Facebook")
	public void TestCase7() {
		Reporter.log("Running Test Case 7", true);
	}

}

