package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		 By forgortPwd=By.linkText("Forgotten Password");
		 By firstname=By.id("input-firstname");
		 
		 String forgotPwd_href=driver.findElement(forgortPwd).getAttribute("href");
		 System.out.println(forgotPwd_href);
		 
		 String fn_placeholder_value=driver.findElement(firstname).getAttribute("placeholder");	 
		 System.out.println(fn_placeholder_value);
		 
		 //check unique image in the page
		 By logoImage=By.className("img-responsive");
		 
//		 WebElement logo=driver.findElement(logoImage);
//		 String srcval=logo.getAttribute("src");
//		 String titleval=logo.getAttribute("title");
//		 String altvalue=logo.getAttribute("alt");
//		 
//		 System.out.println(srcval);
//		 System.out.println(titleval);
//		 System.out.println(altvalue);
		 
		 String srcvalue=getElementAttribute(logoImage,"src");
		 System.out.println(srcvalue);
		 
		 
		 

	}
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
