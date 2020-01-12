package test_scripts;

import generic_methods.Base_Class;
import generic_methods.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Gmail_Password;
import pom.Gmail_Username;
import pom.Inbox_Page;

public class Compose_Mail extends Base_Class
{
	@Test
	public void Compose_mail() throws Exception
	{
		String Username = Excel.getdata("Sheet1", 1, 0);
		String password = Excel.getdata("Sheet1", 1, 1);
		pom.Gmail_Username g1 = new pom.Gmail_Username(driver);
		g1.username(Username);
		g1.nextbutton_un();
		pom.Gmail_Password g2 = new pom.Gmail_Password(driver);

		g2.password(password);
		g2.nextbutton_un();
		pom.Inbox_Page I1 = new pom.Inbox_Page(driver);
		I1.compose_btn();
		I1.Tofield();
		I1.subjectbody();
		I1.subjectbox();
		I1.sendbutton();

		I1.signoutlogo();
		I1.singoutbutton();

	}

}
