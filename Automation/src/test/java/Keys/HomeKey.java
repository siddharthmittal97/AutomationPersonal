package Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeKey 
{
    private WebDriver driver;
	public HomeKey(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void FindExactElement(String linktext)
	{
		driver.findElement(By.linkText(linktext)).click();
	}
	public KeysPage Click()
	{
		FindExactElement("Key Presses");
		return new KeysPage(driver);
	}

}
