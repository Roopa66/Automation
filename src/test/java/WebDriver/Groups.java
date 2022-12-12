package WebDriver;

import org.testng.annotations.Test;

public class Groups {

	@Test (groups="Rolex")

	public void group() {
		System.out.println("registration");
	}

	@Test (groups = "Avengers")
	public void search() {
		System.out.println("login");

	}

	@Test (groups="Spider")
	public void greatest() {
		System.out.println("Greatest");
	}

}
