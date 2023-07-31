package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtils {

	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By images = By.tagName("img");
		By links = By.tagName("a");

//		List<WebElement> imagesList = driver.findElements(images);
		
		System.out.println(getElementsCount(links));
		System.out.println(getElementsCount(images));
		
		List<String> eletextLinks=getElementsTextList(links);
		System.out.println(eletextLinks);
		
		if(eletextLinks.contains("Privacy Policy")) {
			System.out.println("Privacy Policy --->pass");
		}
		
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList=getElements(locator);
		List<String> eleTextList=new ArrayList<String>();
		for(WebElement e : eleList) {
			String text=e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
				}
			
		}
		return eleTextList;
	}
	

	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
