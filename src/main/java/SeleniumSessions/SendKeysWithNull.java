package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {

	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By fn_id=By.id("input-firstname");
//		driver.findElement(fn_id).sendKeys("null"); //it will enter null value becoz it is mentioned in string
		
//		driver.findElement(fn_id).sendKeys(null);//it will give IllegalArguement exception - we cannot pass null value -selenium will reject this
		
//		driver.findElement(fn_id).sendKeys("");//just blinking but not give any exception
		
		driver.findElement(fn_id).sendKeys(" ");
		
		//in sendkeys - character sequence ..keytosend will show means it is an interface in java 
		
		String str="naveen";
		StringBuilder sb=new StringBuilder("Automation");
		StringBuffer sb1=new StringBuffer("Labs");
		
		driver.findElement(fn_id).sendKeys(str+sb+sb1);//here passing character sequence in sendkeys --valid and enter 
		

		driver.findElement(fn_id).sendKeys(str,sb,sb1);//valid and enter - naveenAutomationLabs
		
		
		
		
	}

}
