package Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class KeysPage 
{
	private WebDriver driver;
	private By Input = By.id("target"); //CSS SELECTORS
	private By Result   = By.id("result");
 	public KeysPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void SendData(String text)
	{
		driver.findElement(Input).sendKeys(text);
	}
	public String getResult()
	{
		return driver.findElement(Result).getText();
	}
}
