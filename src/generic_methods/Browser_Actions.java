package generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Browser_Actions
{
	public void New_Tab(WebDriver driver,WebElement target)
	{
		Robot r1;
		Actions a1=new Actions(driver);
		a1.contextClick(target);
		try{
		 r1=new Robot();
		 r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		}
		catch(AWTException a12)
		{
			
		}
		
	}
	
	public void Hit_enter(WebDriver driver)
	{
		Robot r1;
		try
		{
        r1=new Robot();
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(AWTException a1)
		{
			
		}
	
	
	}
	public void Tab_Action(WebDriver driver)
	{
		Robot r1;
		try
		{
        r1=new Robot();
        r1.keyPress(KeyEvent.VK_T);
        r1.keyRelease(KeyEvent.VK_T);
		}
		catch(AWTException a1)
		{
			
		}
	
	
	}

	

}
