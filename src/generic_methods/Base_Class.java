package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements framework_constants
{
	public WebDriver driver;
	@BeforeMethod
	public void Launchappln()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get(URL);
		
	}
	@AfterMethod
	public void closeappln(){
		driver.close();
	}

}
