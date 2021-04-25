package HandlingContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class ContextPage 
{
	private WebDriver driver;
	private By ClickBox = By.xpath("//div[@id='hot-spot']");
	public ContextPage(WebDriver driver) 
	{
	this.driver=driver;	
	}
	public void clickingBox()
	{
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(ClickBox)).perform();
	}
	public void AlertOk()
	{
		driver.switchTo().alert().accept();
	}
	public String GetAlertText()
	{
		return driver.switchTo().alert().getText();
	}
}
