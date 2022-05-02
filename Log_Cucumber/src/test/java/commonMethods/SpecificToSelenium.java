package commonMethods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SpecificToSelenium {
	
	public static void windowTitle(WebDriver driver,String expectedWindowTitle) {
		
		Assert.assertEquals(driver.getTitle(), expectedWindowTitle);
		
	}

}
