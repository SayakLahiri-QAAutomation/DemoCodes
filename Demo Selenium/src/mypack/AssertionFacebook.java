package mypack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionFacebook {

	@Test
	public void assertEquals(){
		Assert.assertEquals("This assertion will pass","This assertion will pass");
		
		System.out.println("This line is executed because assertEquals "
				+ "passed since both the strings are same");
		
		Assert.assertEquals("assertion","This assertion will fail");
		
		System.out.println("This line will not be executed because "
				+ "assertEquals fails both the strings are different."
				+ "Also the test/method will be declared failed");
	}

}



