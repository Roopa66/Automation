package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlights {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();

	  
	  WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/dashboard.xhtml");
	  WebElement element = driver.findElement(By.id("email"));
	  
	  Actions act =new Actions(driver);
	  
	  
	  //Highlight the words
	  
	  act.sendKeys(element, "yrupa1839");
	  act.doubleClick() ;
	  act.contextClick();
	  act.build().perform();
	  
	  
  }
}
