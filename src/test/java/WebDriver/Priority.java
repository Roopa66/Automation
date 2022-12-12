package WebDriver;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority {
	
  @Test(priority =2) 
  public void zoo() {
	  System.out.println("registration");
  }
  @Test (groups = {"Avengers", "Rolex"})
  public void login() {
	  System.out.println("login");
	  
	  
  }
  @Test(priority = 1) 
  public void greatest() {
	  System.out.println("Greatest");
  }
  }

