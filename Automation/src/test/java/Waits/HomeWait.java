package Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeWait 
{
	private WebDriver driver;
	public HomeWait(WebDriver driver) 
	{
	this.driver=driver;	
	}
	public void FindExactElement(String linktext)
	{
		driver.findElement(By.linkText(linktext)).click();
	}
	public LoadingPage Click()
	{
		FindExactElement("Dynamic Loading");
		return new LoadingPage(driver);
	}	
}
