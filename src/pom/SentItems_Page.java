package pom;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentItems_Page 
{
	@FindBy(xpath="//a[@title='Sent']")
	private WebElement Sent_items;
	
	@FindBy(xpath="//a")
	private java.util.List<WebElement>links;
	
	
	
	public SentItems_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void click_sentitems() throws InterruptedException{
		Thread.sleep(8000);
		Thread.sleep(8000);
		Thread.sleep(8000);
		Sent_items.click();
	}
	public void countlinks() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("no of links in the sent items are "+links.size());
		
	}
	
	
	

}
