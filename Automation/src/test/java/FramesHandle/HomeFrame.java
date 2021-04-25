package FramesHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeFrame 
{
	private WebDriver driver;
	private By ClickLink = By.xpath("//a[contains(text(),'WYSIWYG Editor')]");
	public HomeFrame(WebDriver driver) 
	{
	  this.driver=driver;	
	}
	public FramePage clickContext()
	{
		clickContextLink();
		return new FramePage(driver);
	}
	public void clickContextLink()
	{
		driver.findElement(ClickLink).click();
	}
}
