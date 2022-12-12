package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
  @Test
  public void fox4() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// added dependency for selenium java

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://leafground.com/radio.xhtml");
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]/span")).click();
		
		
  }
}
