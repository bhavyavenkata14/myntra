package generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class project_generic {

	public WebDriver driver;

	static{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	}
	
	@BeforeMethod
public void open()
{
	
	 driver=new FirefoxDriver();
	//driver.get("https://www.facebook.com");
	driver.get("https://192.168.0.5:9002");
}

 @AfterMethod
 public void close()
 {
	 
		driver.quit();
 }
}
