package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_KeyWords {

	//1. invocationCount
   // @Test(invocationCount = 10)
//	public void TC1() {
	//	Reporter.log("Running TC1");
	//}
    
    //2. priority most important
    
		@Test(priority = 2)
		public void TC2() {
			Assert.fail();
			Reporter.log("running TC2", true);
		}
    
    @Test(priority = -1, dependsOnMethods = {"TC2"})
    public void TC3() {
    	Reporter.log("Running TC3", true);
    }
    
    @Test(priority = -1, enabled = false)
    public void TC4() {
    	Reporter.log("Running TC4", true);
    }
    
    @Test(timeOut = 2000, dependsOnMethods = {"TC3"})
	public void TC5() throws InterruptedException {
		//Thread.sleep(4000);
		Reporter.log("running TC5", true);
	}//marked as FAIL

}
