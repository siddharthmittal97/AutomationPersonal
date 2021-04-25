package HandlingContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeContext 
{
	private WebDriver driver;
	private By ClickLink = By.xpath("//a[contains(text(),'Context Menu')]");
	public HomeContext(WebDriver driver) 
	{
		this.driver=driver;
	}
	public ContextPage clickContext()
	{
		clickContextLink();
		return new ContextPage(driver);
	}
	public void clickContextLink()
	{
		driver.findElement(ClickLink).click();
	}
}
