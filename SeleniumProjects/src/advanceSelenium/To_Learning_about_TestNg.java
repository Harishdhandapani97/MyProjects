package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learning_about_TestNg {

	String circbuzz="dhoni";
	String Robbin="hussain bolt";
	String Amazon="mobilephones";
	@Test
	public void circbuzz() {
    Reporter.log("Circbuzz got Exceuted"+circbuzz);
	}

	@Test
	public void baskiRobbin() {
		Reporter.log("Circbuzz got Exceuted"+Robbin);

	}

	@Test
	public void Amazon() {

		Reporter.log("Circbuzz got Exceuted"+Amazon);
	}
}
