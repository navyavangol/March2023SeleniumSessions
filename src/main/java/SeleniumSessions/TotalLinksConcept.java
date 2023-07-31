package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// open any URL
		// get the count of links on the page
		// print the text of each link on the console
		// but ignore blank text

		driver = new ChromeDriver();
		driver.get("https://amazon.com");

		By links = By.tagName("a");

		// list is a dynamic why we store in list becoz findelements will define in list
		// of webelements
		List<WebElement> linksList = driver.findElements(links);
//		System.out.println(linksList);// [] - it will return empty list if we pass the wrong locator
		int linksCount = linksList.size();
		System.out.println("Total links count :" + linksCount);

		// 1. Index based loop
//		for (int i = 0; i < linksCount; i++) {
//			String text = linksList.get(i).getText();
//			if(!text.isEmpty()) {
//			System.out.println(i + ":" + text);
//			}
//		}

		// 2. for each loop
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(count + ":" + text);
			}
			count++;
		}

	}

}
