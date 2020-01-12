package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inbox_Page 
{
	@FindBy(xpath="//span[@class='gb_Ia gbii']")
	private WebElement singout_logo;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signout_btn;
	
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement compose_btn;
	
	@FindBy(name="to")
	private WebElement Tofield;
	
	@FindBy(name="subjectbox")
	private WebElement subjectbox;
	
	@FindBy(xpath="//div[@id=':qt']")
	private WebElement subjectbody;
	
	@FindBy(xpath="//div[@id=':pe']")
	private WebElement send_button;
	
	
	public Inbox_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void signoutlogo() throws InterruptedException
	{
		Thread.sleep(8000);
		Thread.sleep(8000);
		singout_logo.click();
	}
	public void singoutbutton() throws InterruptedException
	{Thread.sleep(4000);
		signout_btn.click();
	}
	public void compose_btn() throws InterruptedException
	{Thread.sleep(8000);
	Thread.sleep(8000);
	Thread.sleep(8000);
		compose_btn.click();
	}
	public void Tofield() throws InterruptedException{
		Thread.sleep(8000);
		Thread.sleep(8000);
		Tofield.sendKeys("shantu147@gmail.com");
	}
	public void subjectbox() throws InterruptedException
	{Thread.sleep(8000);
		subjectbox.sendKeys("POM MASTER CLASS MAIL");
	}
	public void subjectbody() throws InterruptedException{
		Thread.sleep(4000);
		subjectbody.sendKeys("hello we are here");
	}
	public void sendbutton() throws InterruptedException
	{Thread.sleep(4000);
		send_button.click();	
	}
	
	
	

}
