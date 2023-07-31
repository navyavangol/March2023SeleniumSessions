package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		
		selectEmp("John.Smith");
		selectEmp("Jasmine.Morgan");
		
		System.out.println(getEmpInfo("John.Smith"));
		System.out.println(getEmpInfo("Jasmine.Morgan"));
		

	}

	public static void selectEmp(String empName) {

		driver.findElement(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getEmpInfo(String empName) {
		List<WebElement> infoList=driver.findElements(By.xpath("//a[text()='"+empName+"']/parent::td/following-sibling::td"));
		System.out.println(infoList.size());
		List<String> infoValList=new ArrayList();
		for(WebElement e : infoList) {
			String text=e.getText();
			infoValList.add(text);		
		}
		return infoValList;
	}
}
