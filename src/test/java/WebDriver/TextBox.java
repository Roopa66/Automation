package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {
  @Test
  
  public void fox2() throws InterruptedException  {
  
  

	WebDriverManager.chromedriver().setup();

	// added dependency for selenium java

	WebDriver driver;
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://www.leafground.com/dashboard.xhtml");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[3]/a/i[1]")).click();
	
	driver.findElement(By.linkText("Text Box")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("j_idt88:name")).sendKeys("Roopa M.G.");
	
	driver.findElement(By.id("j_idt88:j_idt95")).clear();
	
	driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
	
	driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("mgroopa.m@hcl.com");
	driver.switchTo().activeElement();
	
	driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Something");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[8]/div/div/div[2]/div[1]")).sendKeys("selenium course and its details");
	
	
	WebElement m =driver.findElement(By.id("j_idt106:thisform:age"));
	m.sendKeys(Keys.ENTER);
	
	
}
}
