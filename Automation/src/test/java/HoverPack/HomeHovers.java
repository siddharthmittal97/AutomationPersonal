package HoverPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeHovers 
{
	private WebDriver driver;
	public HomeHovers(WebDriver driver) 
	{
		this.driver=driver;
	}
	public HoverPage ClickHover()
	{
		FindElement("Hovers");
		return new HoverPage(driver);
	}
	public void FindElement(String LinkText)
	{
		driver.findElement(By.linkText(LinkText)).click();
	}
}

