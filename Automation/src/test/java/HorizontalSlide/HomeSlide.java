package HorizontalSlide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeSlide 
{
	private WebDriver driver;
	public HomeSlide(WebDriver driver) 
	{
		this.driver=driver;
	}
	public SlidePage ClickHorizontalSlide()
	{
		FindElement("Horizontal Slider");
		return new SlidePage(driver);
	}
	public void FindElement(String LinkText)
	{
		driver.findElement(By.linkText(LinkText)).click();
	}
}
	