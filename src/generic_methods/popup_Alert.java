package generic_methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class popup_Alert 
{
	public void switctoalert(WebDriver driver)
	{
		Alert switch1 = driver.switchTo().alert();
		
	}
	public void Acceptalert(WebDriver driver)
	{
		Alert switch1 = driver.switchTo().alert();
		switch1.accept();
		
	}
	public void DismissAlert(WebDriver driver)
	{
		Alert switch1 = driver.switchTo().alert();
		switch1.dismiss();
		
	}
	public String  gettextAlert(WebDriver driver)
	{
		Alert switch1 = driver.switchTo().alert();
		String text=switch1.getText();
		return text;
	}

}
