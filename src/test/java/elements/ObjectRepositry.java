package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ObjectRepositry {
  @Test
  public WebElement name(WebDriver driver) {
	  return driver.findElement(By.id("ap_customer_name"));
  }
  
  public WebElement email(WebDriver driver) {
	  return driver.findElement(By.id("ap_email"));
  }
  public WebElement pswd(WebDriver driver) {
	  return driver.findElement(By.id("ap_password"));
  }
  public WebElement confirmpswd(WebDriver driver) {
	  return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[2]/input"));
  }
  public void cntinuebtn(WebDriver driver) {
	   driver.findElement(By.id("continue")).click();
  }
}
