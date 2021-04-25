package AlertHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AlertPage 
{
	private By Button1 = By.xpath("//button[contains(text(),'Click for JS Alert')]");
	private By Result = By.xpath("//p[@id='result']");
	
    private WebDriver driver;	
	public AlertPage(WebDriver driver) 
	{
		this.driver=driver;
	}	
	public void PressOk()
	{
		driver.switchTo().alert().accept();
	}
	public String GetResults()
	{
		return driver.findElement(Result).getText();
	}
	public void ClickButton()
	{
		driver.findElement(Button1).click(); 
	}
}
