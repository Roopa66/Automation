package WebDriver;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOf {
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/list.xhtml");

		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[3]/div/div/div/div[2]/ul/li"));
		System.out.println(list.size());

		Actions act= new Actions(driver);
	
		act.keyDown(Keys.CONTROL)
		   .click(list.get(0))
		   .click(list.get(1))
		   .click(list.get(5))
		   .keyUp(Keys.CONTROL)
		   .build().perform();
		
		
	}

}
