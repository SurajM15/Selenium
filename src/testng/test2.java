package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test(invocationCount = 4, enabled = false)
	public void calls() {
		Reporter.log("Calls",true);
	}
	@Test(priority = 1, invocationCount = 3)
	public void status() {
		Reporter.log("status",true);
	}
	@Test(priority = -2, invocationCount = 2)
	public void video() {
		Reporter.log("video",true);
	}
}
