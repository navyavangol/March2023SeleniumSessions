package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// context menu means Right click concept
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Thread.sleep(3000);

//		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions act = new Actions(driver);
//		act.contextClick(rightClickEle).perform();
//
//		List<WebElement> options = driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//
//		for (WebElement e : options) {
//
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Paste")) {
//				e.click();
//				break;
//			}
//		}

		// driver.findElement(By.xpath("//span[text()='Copy']")).click();

		By contextMenuLocator = By.xpath("//span[text()='right click me']");
		selectRightClickOption(contextMenuLocator, "Quit");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectRightClickOption(By contextMenuLocator, String optionValue) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator = By.xpath("//*[text()='" + optionValue + "']");
		getElement(optionLocator).click();
	}
}
