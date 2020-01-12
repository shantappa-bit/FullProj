package test_scripts;

import generic_methods.Base_Class;
import generic_methods.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Gmail_Password;
import pom.Gmail_Username;
import pom.SentItems_Page;

public class No_Links_Sentitems_Page extends Base_Class
{
	
	@Test
public void links_count() throws Exception
	{

		String Username = Excel.getdata("Sheet1", 1, 0);
		String password = Excel.getdata("Sheet1", 1, 1);
		Gmail_Username g1=new Gmail_Username(driver);
		g1.username(Username);
		g1.nextbutton_un();
		Gmail_Password g2=new Gmail_Password(driver);
		
		g2.password(password);
		g2.nextbutton_un();
		SentItems_Page s1=new SentItems_Page(driver);
		s1.click_sentitems();
		s1.countlinks();
		
		
	}

}
