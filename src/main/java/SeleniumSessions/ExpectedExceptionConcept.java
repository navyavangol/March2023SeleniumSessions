package SeleniumSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	String name;
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void searchTest() {
		System.out.println("searchTest");
		int i=10/0;
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		obj.name="navya";//NPE(Null pointer Exception)
	}
	
	
	

}
