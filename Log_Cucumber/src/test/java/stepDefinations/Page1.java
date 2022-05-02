package stepDefinations;


import commonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;
import utility.InvokeBrowser;

public class Page1 {
	
	@Given("user is on {string} page")
	public void user_is_on_page(String expTitle) {	
		SpecificToSelenium.windowTitle(InvokeBrowser.getDriver(), expTitle);
}



}
