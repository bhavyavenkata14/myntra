package generic_libraries;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webelement_generic {
	
	private static final String  s = null;


	public String gettext(WebElement ele)
	{
		String text = ele.getText();
		return text;
	}
	
	
	public String tagname(WebElement ele)
	{
		String name=ele.getTagName();
		return name;
	}

	
	public String attribute(WebElement ele,String val)
	{
		String att = ele.getAttribute(val);
		return att;
		
	}
	
	public Point loc(WebElement ele)
	{
		Point l = ele.getLocation();
		int x=l.getX();
		System.out.println(x);
		int y=l.getY();
		System.out.println(y);
		return l;
	}
	
	public String cssval(WebElement ele,String val)
	{
		String css = ele.getCssValue(val);
		return css;
	}
	
	
	
	public boolean isdisplayed(WebElement ele)
	{
		boolean val = ele.isDisplayed();
		return val;
	}
	
	
	public boolean isenabled(WebElement ele)
	{
		boolean val = ele.isEnabled();
		return val;
	}
	
	
	
	public boolean isselected(WebElement ele)
	{
		boolean val = ele.isSelected();
		return  val;
	}
	
	
	public void clear(WebElement ele)
	{
		ele.clear();
	}
	
	
	public void click(WebElement ele)
	{
		ele.click();
	}
	
	
	public void sendkys(WebElement ele,String val)
	{
		ele.sendKeys(val);
		
	}
	
	
	public void select(WebElement ele,int i,String value,String text)
	{
		 Select  s=new Select(ele);
		 s.selectByIndex(i);
		 s.selectByValue(value);
		 s.selectByVisibleText(text);
	}
}




