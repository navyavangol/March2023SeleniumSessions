package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {

	//invocationCount means how many time that particular test should execute
	
	@Test(invocationCount=10,priority=1,expectedExceptions=Exception.class)
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}
	
	@Test(priority=2)
	public void cartTest() {
		System.out.println("carttest");
		Assert.assertEquals("macbook", "macbook");
	}
}
