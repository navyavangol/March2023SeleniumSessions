package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1_AccountRegTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		driver.findElement(By.id("input-firstname")).sendKeys("Navya");
//		driver.findElement(By.name("lastname")).sendKeys("VS");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("navya1@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("12535643");
//		driver.findElement(By.name("password")).sendKeys("navya");
//		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("navya");
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
//		
//		String registrationSuccessMsg=driver.findElement(By.tagName("h1")).getText();
		
		By fn_id=By.id("input-firstname");
		By ln_name=By.name("lastname");
		By email_xpath=By.xpath("//*[@id=\"input-email\"]");
		By phone_id=By.id("input-telephone");
		By pwd_name=By.name("password");
		By pwdConfirm_css=By.cssSelector("#input-confirm");
		By agreeClick_name=By.name("agree");
		By continue_xpath=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By regMsg=By.tagName("h1");
		
		doSendKeys(fn_id,"navya");
		doSendKeys(ln_name,"VS");
		doSendKeys(email_xpath,"navya3@gmail.com");
		doSendKeys(phone_id,"3455432");
		doSendKeys(pwd_name,"navya");
		doSendKeys(pwdConfirm_css,"navya");
		doClick(agreeClick_name);
		doClick(continue_xpath);
		String registrationSuccessMsg=getText(regMsg);
		
		
		if(registrationSuccessMsg.equals("Your Account Has Been Created!")) {
			System.out.println("Registration is success");
		}
		else {
			System.out.println("Registration is failed");
		}

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
	
	public static String getText(By locator) {
		return getElement(locator).getText();
	}

}
