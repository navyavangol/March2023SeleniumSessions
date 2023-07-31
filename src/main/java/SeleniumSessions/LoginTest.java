package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email_id=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtil eleUtl=new ElementUtil(driver);
		eleUtl.doSendKeys(email_id, "naveen@gmail.com");
		eleUtl.doSendKeys(pwd, "test@123");
		

	}

}
