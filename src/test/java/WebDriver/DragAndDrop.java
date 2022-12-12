package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void fast() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement element = driver.findElement(By.id("form:conpnl"));
		WebElement source = driver.findElement(By.id("form:drag_content"));
		WebElement destination = driver.findElement(By.id("form:drop_content"));

		// Drag and Drop
		Actions act1 = new Actions(driver);

		act1.dragAndDropBy(element, 250, 0).build().perform();
		act1.dragAndDrop(source, destination).build().perform();

//Hands -On

		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source1 = driver.findElement(By.id("form:j_idt94:j_idt99"));
		WebElement destination1 = driver.findElement(By.id("form:j_idt94:j_idt97"));
		WebElement source2 = driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/table/tbody/tr[4]"));
		WebElement destination2 = driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/table/tbody/tr[1]"));

		Actions act = new Actions(driver);

		act.dragAndDrop(source1, destination1).build().perform();

		act.dragAndDrop(source2, destination2).build().perform();

	}
}
