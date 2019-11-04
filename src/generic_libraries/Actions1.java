package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public void mouseover(WebDriver driver,WebElement ele)
	{
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	
	public void drag(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2);
		
	}
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	
	
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
		
	}

	public void tab(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	
	public void window(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
	}
	
	
	
	public void privatewindow(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		
	
		
	}
	
	
}
