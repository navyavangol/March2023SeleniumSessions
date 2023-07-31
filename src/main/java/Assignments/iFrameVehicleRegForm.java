package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameVehicleRegForm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Vehicle Reg");

		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Bng");
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("2023-06-22");
		
		driver.findElement(By.name("RESULT_TextArea-5")).sendKeys("Hi");
		
		driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("C:\\Users\\itnav\\OneDrive\\Desktop\\test.docx");
		
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Navya");
		
		driver.findElement(By.name("RESULT_TextField-9")).sendKeys("VS");
		
		driver.findElement(By.name("RESULT_TextField-10")).sendKeys("Ranka colony");
		
		driver.findElement(By.name("RESULT_TextField-11")).sendKeys("Bilekahalli");
		
		driver.findElement(By.name("RESULT_TextField-12")).sendKeys("Bangalore");
		
		Select sel=new Select(driver.findElement(By.id("RESULT_RadioButton-13")));
		sel.selectByValue("Radio-3");
		
		driver.findElement(By.name("RESULT_TextField-14")).sendKeys("560076");
		
		driver.findElement(By.name("RESULT_TextField-15")).sendKeys("12345432");
		
		driver.findElement(By.name("RESULT_TextField-16")).sendKeys("navya@gmai.com");
		
		driver.switchTo().defaultContent();
		
		String info = driver.findElement(By.id("tooltip")).getText();
		System.out.println(info);
		
		
	}

}
