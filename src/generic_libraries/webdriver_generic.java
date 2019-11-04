package generic_libraries;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webdriver_generic {
	
	public void close(WebDriver driver)
	{
         driver.close();
	}
	
	public void get(WebDriver driver,String value)
	{
		 driver.get(value);

	}
	
	public String geturl(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public String pagesrc(WebDriver driver)
	{
		String pgesrc = driver.getPageSource();
		System.out.println(pgesrc);
		return pgesrc;
	}
	
	
	
	public String title(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	
	public String windowhandle(WebDriver driver)
	{
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		return handle;
		
	}
	
	public void windowhandlesss(WebDriver driver,String id)
	{
		Set<String> handles = driver.getWindowHandles();
		int count = handles.size();
		System.out.println(count);
		for(String str:handles)
		{
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		ArrayList<String>list= new ArrayList<String>(handles);
		int count1 = list.size();
		System.out.println(count1);
		
		driver.get(id);
		
	}
	
	public void manage(WebDriver driver)
	{
		driver.manage();
	}
	
	
	public void navigate(WebDriver driver,String ur)
	{
		driver.navigate().to(ur);
	}
	
	public void switchto(WebDriver driver,String win)
	{
		driver.switchTo().window(win);
	}
	
	
	
	
	
	
	
	
	
	
	
}
