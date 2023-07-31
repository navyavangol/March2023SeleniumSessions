package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//open the browser
		//ChromeDriver driver=new ChromeDriver();
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		//EdgeDriver driver=new EdgeDriver();
		WebDriver driver=new ChromeDriver();
		
		//Enter the url
		driver.get("https://www.google.com");
		
		//get the title
		String title=driver.getTitle();
		
		System.out.println(title);
		
		//verify the title :act vs exp result : checkpoint/verification point
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		//automation testing -->automation steps + checkpoint(verification)(act vs expec)
		
		driver.quit(); //close the browser
	}

}
