package test_scripts;

import generic_methods.Base_Class;
import generic_methods.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Gmail_Password;
import pom.Gmail_Username;
import pom.Inbox_Page;

public class Login_logout extends Base_Class
{
	@Test
	public void Username_test() throws Exception
	{
		String Username = Excel.getdata("Sheet1", 23, 5);
		String password = Excel.getdata("Sheet1", 23, 6);
		pom.Gmail_Username g1=new pom.Gmail_Username(driver);
		g1.username(Username);
		g1.nextbutton_un();
		pom.Gmail_Password g2=new pom.Gmail_Password(driver);
		
		g2.password(password);
		g2.nextbutton_un();
		
		pom.Inbox_Page I1=new pom.Inbox_Page(driver);
		I1.signoutlogo();
		I1.singoutbutton();
		
		
		
		
		
		
		
	}

}
