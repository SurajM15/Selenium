package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void Demo() {
		Reporter.log("Hello selenium",true);
		Reporter.log("Hello java",false);
		
	}

}
