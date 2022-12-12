package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
  @Test
  public void fox1() throws InterruptedException  {
  
  

	WebDriverManager.chromedriver().setup();

	// added dependency for selenium java

	WebDriver driver;
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://www.leafground.com/dashboard.xhtml");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[3]/a/i[1]")).click();
	
	driver.findElement(By.linkText("Button")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("j_idt88:j_idt90")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys("yrupa1839@gmail.com");
	
	driver.findElement(By.id("message")).sendKeys("Trainer");
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("j_idt130")).click();
	
}
}
