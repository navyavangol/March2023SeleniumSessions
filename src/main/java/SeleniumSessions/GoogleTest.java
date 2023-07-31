package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {

	public static void main(String[] args) {

		// sel 4.5.0
		// Exception in thread "main" java.lang.IllegalStateException:
		// The path to the driver executable
		// The path to the driver executable must be set by the webdriver.chrome.driver
		// system property;

		// mac:
		// System.setProperty("webdriver.gecko.driver",
		// "/Users/naveenautomationlabs/Documents/drivers/geckodriver");

		// windows:
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\itnav\\Downloads\\drivers\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();

		// enter the url:
		driver.get("https://www.google.com");

		// get the title:
		String title = driver.getTitle();
		System.out.println("act title: " + title);

	}

}
