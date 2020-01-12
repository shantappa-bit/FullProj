package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Password 
{
	@FindBy(name="password")
	private WebElement pwd_tbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement next_btn;
	
	public Gmail_Password(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void password(String pw) throws InterruptedException{
		Thread.sleep(4000);
		pwd_tbox.sendKeys(pw);
	}
	public void nextbutton_un(){
		next_btn.click();
	}
	

}
