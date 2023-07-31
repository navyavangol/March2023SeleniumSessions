package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		//1. id :Unique Locator -- id is an attribute
		
		//2. name :can be unique /duplicate --99% will be unique -- name is an attribute
		
		//3. classname: can be duplicate and most of the time it is duplicate -- class name is also an attribute
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.findElement(By.className("form-control")).sendKeys("Navya"); //it will enter the value whichever found first in the page
		
		//4. xpath : it is not an attribute -address of the element in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("navya");
//		
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("vs");
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
//		By fn_xpath=By.xpath("//*[@id=\\\"input-firstname\\\"]");
//		By ln_xpath=By.xpath("//*[@id=\\\"input-lastname\\\"]");
//		By continue_xpath=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		doSendKeys(fn_xpath,"navya");
//		doSendKeys(ln_xpath,"vs");
//		doClick(continue_xpath);
		
		//5. CSS selector : not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("navya");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("12344");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		//6. Link text :applicable only for the text of the links
		//html tag is always 'a' tag -means anchor tag -- html=<a> tag
		//attributes,linktext,href value(hyper text reference value)
		//link text can be duplicate
		
//		driver.findElement(By.linkText("Delivery Information")).click();
		
//		By delivery_infolink=By.linkText("Delivery Information");
//		doClick(delivery_infolink);
		
		//7.partial linktext --only for the links
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.Tag Name : html tag, not an attribute --its a bad idea to use
		//it will use only when it is unique
//		driver.findElement(By.tagName("input")).sendKeys("navya"); //org.openqa.selenium.ElementNotInteractableException error will come
		String headerText=driver.findElement(By.tagName("h1")).getText();
		System.out.println(headerText);
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
