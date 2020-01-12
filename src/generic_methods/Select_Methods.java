package generic_methods;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select_Methods 
{
	public void selectByindex(int index,WebElement element)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void selectByvalue(String id,WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(id);
	}
	public void selectByvisibletext(String text_value,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text_value);
	}
	public void DeselectByvisibletext(String text_value,WebElement element)
	{
		Select s=new Select(element);
		s.deselectByVisibleText(text_value);
	}
	public void DeselectByindex(int index,WebElement element)
	{
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	public void DeselectByvalue(String id,WebElement element)
	{
		Select s=new Select(element);
		s.deselectByValue(id);
	}
	public boolean  ismultiple(WebDriver driver,WebElement ele)
	{
		Select s1=new Select(ele);
		boolean value=s1.isMultiple();
		return value;
	}
	public List<WebElement> getallselectedoptions(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> stored = s.getAllSelectedOptions();
		return stored;
	}
	public int COuntdropdownoptions(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> count = s.getOptions();
		int count1 = count.size();
		return count1;
	}
	public WebElement getfirstselectedoptions(WebElement ele)
	{
		Select s=new Select(ele);
	WebElement stored = s.getFirstSelectedOption();
		return stored;
	}
	

}
