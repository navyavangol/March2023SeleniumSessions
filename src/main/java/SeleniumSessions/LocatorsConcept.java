package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		//create a web element + perform action(click,sendkeys,gettext,isdisplayed)
		
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
		//driver.findElement(By.id("input-email")).sendKeys("navya@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("navya@gmail.com");
		
		//2.
		
		//WebElement emailId=driver.findElement(By.id("input-email"));
		//WebElement password=driver.findElement(By.id("input-password"));
		
		//emailId.sendKeys("navya@gmail.com");
		//password.sendKeys("navya@gmail.com");
		
		//3.By Locator approach
		//By email_id=By.id("input-email");
		//By pwd=By.id("input-password");
		
		//WebElement emailId= driver.findElement(email_id);
		//WebElement password =driver.findElement(pwd);
		
		//emailId.sendKeys("navya@gmail.com");
		//password.sendKeys("navya@gmail.com");
		
		//4.By locator with webelement generic method
		//By email_id=By.id("input-email");
		//By pwd=By.id("input-password");
		//getElement(email_id).sendKeys("navya@gmail.com");
		//getElement(pwd).sendKeys("navya@gmail.com");
		
		//5.By locator with webelement generic method and action generic method
		//By email_id=By.id("input-email");
		//By pwd=By.id("input-password");
		
		//doSendKeys(email_id,"navya@gmail.com");
		//doSendKeys(pwd,"navya@gmail.com");
		
		//6.By locator with webelement generic method and action generic method in utility class
		By email_id=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(email_id, "navya@gmail.com");
		eleUtil.doSendKeys(pwd, "test@123");
	}
	
	

}
