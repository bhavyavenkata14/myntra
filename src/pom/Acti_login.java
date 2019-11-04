package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_login {

	@FindBy(xpath="//input[@name='username']")
  private WebElement usname;
	

	@FindBy(xpath="//input[@name='pwd']")
  private WebElement passwrd;
	
	@FindBy(xpath="//div[.='Login ']")
	  private WebElement login;
		
	@FindBy(xpath="//a[.='Logout']")
	  private WebElement logout;
		
	
	public Acti_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void usn(String name)
	{
		usname.sendKeys(name);
	}
	
	public void pass(String pwd)
	{
		passwrd.sendKeys(pwd);
	}
	
	
	public void log()
	{
		login.click();
	}
	
	
	
	public void logot()
	{
		logout.click();
	}
	
}
