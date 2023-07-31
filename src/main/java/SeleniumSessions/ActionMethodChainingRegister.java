package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodChainingRegister {

	static WebDriver driver;

	public static void main(String[] args) {
//Here by passing only one locator for the firstname and remaining text fields are entered by using actions class, normally we use tab in laptop

		// Generally we wont use this type - this for the interview question

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement fn = driver.findElement(By.id("input-firstname"));

		Actions act = new Actions(driver);

		act.sendKeys(fn, "Shruti")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("automation")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("automation@gmail.com")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("9898989898")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("automation@123")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("automation@123")
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.SPACE)
		.build().perform();
		

	}

}
