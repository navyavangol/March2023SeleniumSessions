package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagesOnAmazon {

	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://amazon.com");

		By images = By.tagName("img");

		List<WebElement> imagesList = driver.findElements(images);
		int count=imagesList.size();
		System.out.println("Total number of images :"+count);
		
		for(WebElement e:imagesList ) {
			String srcValue=e.getAttribute("src");
			String altValue=e.getAttribute("alt");
			System.out.println(srcValue + ":" + altValue);
		}

	}

}
