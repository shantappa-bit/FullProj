package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame_Methods
{
	public void switch_frameByindex(int index,WebDriver driver)
	{
		driver.switchTo().frame(index);
	}
	public void switch_frameByvaluename(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	public void switch_frameByaddress(WebDriver driver,WebElement destadd)
	{
		driver.switchTo().frame(destadd);
	}

}
