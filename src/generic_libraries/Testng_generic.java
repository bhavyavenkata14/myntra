package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_generic {
	public WebDriver driver;

	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	@BeforeMethod
public void open()
{
	
	 driver=new FirefoxDriver();
	//driver.get("https://www.facebook.com");
	//driver.get("http://localhost/login.do;jsessionid=m000p39yffm7");
	 driver.get("https://www.gmail.com");
		
}

 @AfterMethod
 public void close()
 {
	 
		driver.quit();
 }
	
}
