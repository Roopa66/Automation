package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Alerts {
  @Test
  public void a1() throws InterruptedException {
      WebDriverManager.chromedriver().setup();



       WebDriver driver;



       driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.leafground.com/alert.xhtml");
        
        driver.findElement(By.id("j_idt88:j_idt91")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("j_idt88:j_idt93")).click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        
        driver.findElement(By.id("j_idt88:j_idt95")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/div[1]/a")).click();
        
        
        driver.findElement(By.id("j_idt88:j_idt100")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a")).click();
        
        
        driver.findElement(By.id("j_idt88:j_idt106")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@id=\'j_idt88:j_idt108\']/span[2])")).click();
        
        
        driver.findElement(By.id("j_idt88:j_idt104")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("Anusha");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    
        
        driver.findElement(By.id("j_idt88:j_idt111")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]")).click();
    
  }

}
