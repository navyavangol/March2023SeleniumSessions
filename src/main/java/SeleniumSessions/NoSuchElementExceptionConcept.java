package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPwd=By.linkText("Forgotten Password11");
		
		try {
		driver.findElement(forgotPwd).click();//NoSuchElementException
		//once we get the exception the next line of code will execute means it will not print the title
		//findElement throws the exception becoz before clicking that element not found
		}catch(NoSuchElementException e) {
			System.out.println("getting element exception...pls check your locator again");
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());

	}

}
