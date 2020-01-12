package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods
{
	public void mouse_hover(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	public void doubleClick(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
	}
	public void Right_Click(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement target,WebElement source)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

}
