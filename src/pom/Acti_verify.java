package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_verify {
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	  private WebElement options;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	  private WebElement About;
	

	@FindBy(xpath="//td[@class='aboutContentCell']//span")
	  private WebElement Version;
		
	
	public Acti_verify(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectopt()
	{
		options.click();
	}
	
	public void aboutacti() 
	{
		About.click();
	}
	
	
	
	
	public void version()
	{
		
	
		String version = Version.getText();
		System.out.println(version);
	}
	
	
	

}
