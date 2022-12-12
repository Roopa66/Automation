package WebDriver;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;


public class DependOnMethods {
  @Test
  public void register() {
	  Assert.fail("fail this method");
	  System.out.println("registration");
  }
  @Test(dependsOnMethods ="register")
  public void login() {
	  System.out.println("login");
	  
	  
  }
  @Test(dependsOnMethods="login")
  public void greatest() {
	  System.out.println("Greatest");
  }
  @Test (groups={"Rolex", "Spider"})
  public void rachel() {
	  System.out.println("Rachel");
}}
