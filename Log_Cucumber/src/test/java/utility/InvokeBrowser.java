package utility;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	
	
	public static WebDriver driver=null;
	 
	private static Properties value;
	
	//constructor
	//to get values from property file
	
	
	
	
	
	public  WebDriver  setDriver() {
		
		PropertyReader obj_PropertyReader=new PropertyReader("browser_url.properties");
		value=obj_PropertyReader.propertyReader();
		
		if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			  ChromeOptions obj_ChromeOptions=new ChromeOptions();
			  obj_ChromeOptions.addArguments("InCognito");
			  obj_ChromeOptions.addArguments("start-maximized");
			  
			  WebDriverManager.chromedriver().setup();
			  
			   driver=new ChromeDriver(obj_ChromeOptions);
			  //log
			  GetLog.logger.info("Chrome browser started");
		  }
		  
		  return driver;
			}
		
		
		//to get browser
		public static WebDriver getDriver() {
			return driver;
		}


		//to open url
		public WebDriver openUrl(WebDriver driver) {
			driver.get(value.getProperty("url"));
			
			//log
			  GetLog.logger.info("url");
			return driver;
		}

		//to close browser
		public static void close(WebDriver driver) {
			driver.close();
			
			//log
			  GetLog.logger.info("browser closed");
		}

}
