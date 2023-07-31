package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		 By regHeader=By.tagName("h1");
		 By forgortPwd=By.linkText("Forgotten Password");
//		 System.out.println(doElementGetText(regHeader));
//		 System.out.println(doElementGetText(forgortPwd));
		 
//		 boolean flag=driver.findElement(regHeader).isDisplayed();
//		 System.out.println(flag);
		 
		 if(checkElementIsDisplayed(regHeader)) {
			 System.out.println("registration header is displayed");
			 String regHeaderText=doElementGetText(regHeader);
			 if(regHeaderText.equals("Register Account")) {
				 System.out.println("Registor account -- Pass");
			 }
			 else {
				 System.out.println("Registor account -- Fail");
			 }
		 } 
		 
		 
		 

	}
	
	public static boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static String doElementGetText(By locator) {
		String eleText= getElement(locator).getText();
		System.out.println("Element text is -->" + eleText);
		return eleText;
		}
	}
