package generic_libraries;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public void selectIndex(WebElement ele,int i)
	{
		Select s=new Select(ele);
		s.selectByIndex(i);
	}
	
	
	public void selectValue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
	public void selectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void deselect(WebElement ele)
	{
		Select s=new Select(ele);
		s.deselectAll();
	}
	
	

	public void deselectIndex(WebElement ele,int i)
	{
		Select s=new Select(ele);
		s.deselectByIndex(i);
	}
	
	
	
	public void deselectValue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	
	
	public void deselectText(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(value);
	}
	
	
	
	public int getalloptions(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> options = s.getAllSelectedOptions();
		int count = options.size();
		return count;
	}
	
	
	public int options(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		return count;
	}

	
	public boolean isMultiple(WebElement ele)
	{
		Select s=new Select(ele);
		boolean b = s.isMultiple();
		return b;
	}
	
	//to select all the text
	
	public void options_text(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		for(WebElement we:options)
		{
			String text = we.getText();
			
			System.out.println(text);
		}
		
	}
	
	
	
	public void deselectoptions(WebElement ele)
	{
		Select s=new Select(ele);
	s.deselectAll();

		
	}
}
