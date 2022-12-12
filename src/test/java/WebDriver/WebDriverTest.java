package WebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	@Test
	public void fox() throws InterruptedException {

		// added dependency for webdrivermanager in pom for aal type of browser

		WebDriverManager.chromedriver().setup();

		// added dependency for selenium java

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/");

		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("email")).sendKeys("mgroopa.m@hcl.com");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("HCL");
		
		String default_Value =driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(default_Value);
		
		//driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input")).clear();
		driver.findElement(By.xpath("//http[@input/value=\"Clear me!!\"]")).clear();
		
		//to close chrome
		driver.quit();
		
		

	}
}
