package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.*;
import utility.InvokeBrowser;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void openBrowserAndUrl() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		driver=obj_InvokeBrowser.openUrl(obj_InvokeBrowser.setDriver());
	}
	@After(order=2)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
		final byte[]	screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			
		}
		
	}
	
	@After(order=1)
	public void closeBrowser() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		obj_InvokeBrowser.close(driver);
		
	}

}
