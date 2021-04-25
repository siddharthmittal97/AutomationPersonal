package JavaScriptScroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeJavaScript 
{
	private WebDriver driver;
	public HomeJavaScript(WebDriver driver) 
	{
		this.driver=driver;	
	}
	public void FindExactElement(String linktext)
	{
		driver.findElement(By.linkText(linktext)).click();
	}
	public ScrollPage Click()
	{
		FindExactElement("Large & Deep DOM");
		return new ScrollPage(driver);
	}

}
