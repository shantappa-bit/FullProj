package generic_methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webelement_Methods 
{
	public String  getText(WebElement ele)
	{
		String text=ele.getText();
		return text;
	}
	
	public String  getAttribute(WebElement ele,String Attname)
	{
		String attvalue=ele.getAttribute(Attname);
		return attvalue;
	}
	public String  getcssvalue(WebElement ele,String Attname)
	{
		String cssvalue=ele.getAttribute(Attname);
		return cssvalue;
	}
	public Point  getlocation(WebElement ele,String Attname)
	{
		Point location = ele.getLocation();
		return location;
	}
	public int  getXaxis(WebElement ele,String Attname)
	{
		int X_value = ele.getLocation().getX();
		return X_value;
	}
	public int  getYaxis(WebElement ele,String Attname)
	{
		int Y_value = ele.getLocation().getY();
		return Y_value;
	}
	public int  getwidth(WebElement ele,String Attname)
	{
		int width = ele.getSize().getWidth();
		return width;
	}
	public int  getheight(WebElement ele,String Attname)
	{
		int height = ele.getSize().getHeight();
		return height;
	}
	
	public String Isenabled(WebElement eleaddress)
	{
	boolean result=	eleaddress.isEnabled();
	return result+" Webobject is enabled";
	}
	
	public String Isdisplayed(WebElement eleaddress)
	{
	boolean result=	eleaddress.isDisplayed();
	return result+" Webobject is displayed";
	}

	public String Isselected(WebElement eleaddress)
	{
	boolean result=	eleaddress.isSelected();
	return result+" Webobject is selected";
	}
	
	public void click_On(WebElement ele)
	{
		ele.click();
	}
	public void Pass_Data(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
	public void clear_data(WebElement ele)
	{
		ele.clear();
	}
	public void click_Typesubmit(WebElement ele)
	{
		ele.submit();
	}
	public void getscreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot s1=(TakesScreenshot)driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		String path="./screenshots";
		java.util.Date d1=new java.util.Date();
		String strformat = d1.toString();
		String replaced=strformat.replaceAll(":", "-");
		File copyhere=new File(path+replaced+".jpeg");
		FileUtils.copyFile(source, copyhere);
	
	}
	public void ScrollalongY(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Scroll(0,200)");
		
	}
	public void ScrollalongX(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Scroll(0,200)");
		
	}
	public void ScrollSpecfieelement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguements[0].scrollintoView(true);",ele);
		
	}
	
	{
		
	}
	
	

}
