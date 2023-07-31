package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		String username="admin";
		String pwd="admin";
		driver.get("https://"+username+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");//here only passing the username and pwd in the url itself after https://
		//there is a draw back becoz if the pwd contains @ then it wont work
		
		//basic auth?
		//username:password -->encoded string 
		//btoa method("username:password") --->ERRFIIHGHJ@#*&%
		
		
		
		

	}

}
