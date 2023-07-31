package SeleniumSessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoScoreTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/west-indies-in-united-arab-emirates-2023-1376996/united-arab-emirates-vs-west-indies-2nd-odi-1377006/full-scorecard");

		Thread.sleep(4000);

//		System.out.println(getWckTakerName("Brandon King"));
//		System.out.println(getWckTakerName("Johnson Charles"));

		// span[text()='Brandon
		// King']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]

		getWckTakerDetails("Brandon King");
	}

	public static String getWckTakerName(String batsmanName) {

		System.out.println("batsman name : " + batsmanName);

		return driver
				.findElement(By.xpath("//span[text()='" + batsmanName + "']/ancestor::td/following-sibling::td//span"))
				.getText();

	}

	public static void getWckTakerDetails(String batsmanName) {

		System.out.println("batsman name : " + batsmanName);

		List<WebElement> list = driver.findElements(By.xpath("//span[text()='" + batsmanName
				+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));

		for (WebElement e : list) {
			System.out.println(e.getText());
		}
	}

}
