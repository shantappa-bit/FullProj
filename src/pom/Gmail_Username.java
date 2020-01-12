package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Username 
{
	@FindBy(id="identifierId")
	private WebElement user_tbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement next_btn;
	
	public Gmail_Username(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void username(String un){
		user_tbox.sendKeys(un);
	}
	public void nextbutton_un(){
		next_btn.click();
	}
	

}
