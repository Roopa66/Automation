package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {
	@Test
	public void fox3() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// added dependency for selenium java

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/dashboard.xhtml");

		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[3]/a/i[1]")).click();

		driver.findElement(By.linkText("Hyper Link")).click();

		driver.findElement(By.linkText("Go to Dashboard")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[3]/a/i[1]")).click();

		driver.findElement(By.linkText("Hyper Link")).click();
		
		String destinaationLocation = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
        System.out.println(destinaationLocation); 
        
        driver.findElement(By.linkText("Broken?")).click();
        String currentTitle = driver.getTitle();
        Assert.assertEquals("Error 404 /lists.xhtml Not Found in ExternalContext as a Resource", currentTitle);
        
        driver.navigate().back();
        List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
        int linkCount = totalLinks.size();
        System.out.println(linkCount);
        
        driver.findElement(By.xpath("//*[@src=\"/javax.faces.resource/images/logo-white.svg.xhtml?ln=california-layout\"]")).click();
	}
}
