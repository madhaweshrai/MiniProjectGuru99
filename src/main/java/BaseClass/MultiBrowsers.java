package BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultiBrowsers {
	
	public static WebDriver wdriver;
	
	@BeforeClass
	public void getbrowser() throws Exception {
		Properties prop = new Properties();
		// ("./propertyFiles/dataFile.properties");
		FileInputStream fis = new FileInputStream("./properties/dataFile.properties");

		prop.load(fis);
		if (prop.get("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 wdriver = new ChromeDriver();
			
		} else if (prop.get("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wdriver = new FirefoxDriver();
			//System.setProperty("webdriver.chrome.driver", path);
			/*
			 * The below is where the chrome driver installed in Linux machine
			 * /usr/bin/chromedriver and the below is the local place
			 * .\\exeFiles\\chromedriver.exe
			 */
			
			/*  ChromeOptions options = new ChromeOptions();
			  options.addArguments("headless");
			  options.addArguments("window-size=1200x600");*/
			  wdriver = new ChromeDriver();
			 
			//wdriver = new ChromeDriver();

		} else if (prop.get("browser").equals("internetexplorer")) {
			
			
		} else {
			//wdriver = new HtmlUnitDriver();
		}

		/*
		 * eventListener=new ActivityCapture_WDL(); driver.register(eventListener);
		 */

		

		wdriver.get(prop.getProperty("url"));
		wdriver.manage().window().maximize();

		wdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
}
	@AfterClass
	public void closebrowser()
	{
		wdriver.close();
		
	}
}

