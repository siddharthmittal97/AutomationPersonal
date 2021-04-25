package AlertHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Second 
{
	private WebDriver driver;
	public Second(WebDriver driver) 
	{
		this.driver=driver;
	}
	public AlertPage clickAlert()
	{
		clickAlertLink();
		return new AlertPage(driver);
	}
	public void clickAlertLink()
	{
		driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
	}
}
