package generic_methods;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webdriver_Methods
{
	public String getthe_title(WebDriver driver)
	{
	String 	title=driver.getTitle();
	return title;
	}
	
	public String getthe_url(WebDriver driver)
	{
	String 	Url=driver.getCurrentUrl();
	return Url;
	}
	
	public String getthe_pagesource(WebDriver driver)
	{
	String 	pagesrccode=driver.getPageSource();
	return pagesrccode;
	}
	public void  enter_url(String  url_appln,WebDriver driver)
	{
	driver.get(url_appln);
	
	}
	public String   getwindow_single(WebDriver driver)
	{
	  String parent_id=driver.getWindowHandle();
	  return parent_id;
	
	}
	public Set<String>   getwindow_ids(WebDriver driver)
	{
	  Set<String> Alltabs_id=driver.getWindowHandles();
	 
	 return Alltabs_id;
	
	}
	public void max_browser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public void backward(WebDriver driver)
	{
		driver.navigate().back();
	}
	public void refresh_Page(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	public void  enter_urlsecondway(String  url_appln,WebDriver driver)
	{
	driver.navigate().to(url_appln);
	
	}
	
	
	

}
