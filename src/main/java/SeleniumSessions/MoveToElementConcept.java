package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		Thread.sleep(3000);
//		WebElement parentMenu=driver.findElement(By.className("menulink"));
//		Actions act=new Actions(driver);
//		act.moveToElement(parentMenu);//not valid
//		act.moveToElement(parentMenu).build();//not valid
//		act.moveToElement(parentMenu).perform();//will work and valid
//		act.moveToElement(parentMenu).build().perform();//valid
//		
//		Thread.sleep(1500);
//		driver.findElement(By.linkText("COURSES")).click();
		// using xpath try it

		By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");

		twoMenuHandling(parentMenu, childMenu);
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void twoMenuHandling(By level1MenuLocator, By level2MenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1MenuLocator)).build().perform();
		Thread.sleep(2000);
		getElement(level2MenuLocator).click();

	}
}
