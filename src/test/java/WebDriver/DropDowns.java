package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {
  @Test
  public void fox4() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// added dependency for selenium java

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://leafground.com/select.xhtml");

		Thread.sleep(3000);
		
		Select dropDown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select")));
		
		dropDown.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		//dropDown.selectByValue("1");
		//Thread.sleep(2000);
		dropDown.selectByIndex(3);
		Thread.sleep(2000);
		dropDown.selectByIndex(4);
		boolean value = dropDown.isMultiple();
		System.out.println(value);
		
		Select dropDown1 =new Select(driver.findElement(By.id("j_idt87:auto-complete_hinput")));
		dropDown1.selectByVisibleText(null);
		dropDown1.deselectByValue(null);
		dropDown1.deselectByIndex(0);
		
  }
}
