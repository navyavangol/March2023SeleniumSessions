package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	

	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//when you enter the value in to text field we hav eto fetch and verify
		By fn_id=By.id("input-firstname");
		driver.findElement(fn_id).sendKeys("navya");
//		String fn_value=driver.findElement(fn_id).getText(); //it will not print navya in order to fetch the entered value we have to use getAttribute
		
		String fn_value=driver.findElement(fn_id).getAttribute("value");//always have to use value attribute
		System.out.println(fn_value);

	}

}
