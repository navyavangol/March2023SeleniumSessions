package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframehandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");

		Thread.sleep(3000);

		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");

		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("second crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("third crush");
		
		driver.switchTo().parentFrame();//sel 4.x
		driver.findElement(By.id("jex")).sendKeys("second crush updated");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("first crush updated");
		
		//back to page/browser context
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String h3text=driver.findElement(By.tagName("h3")).getText();
		System.out.println(h3text);
		
		//defaultcontent will come outside from all frame to the main page
		//whereas when we use parentframe it will switch to previous frame(one level up)
		//when we are in third frame when we use defaultcontent it will go to main page 
		//cannot switch directly from frame3 to frame1 by using switchto().frame() , in order to do we have to use parentframe()
		//cannot switch directly from frame1 to directly frame3, always we need to switch one by one frame
		
		
	}

}
