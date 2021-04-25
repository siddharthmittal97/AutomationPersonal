package FramesHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FramePage 
{
	private WebDriver driver;
	// This is Iframe Id
	// This is a But different point & you need to focus this point
	private String Frame = "mce_0_ifr";
	private By textarea = By.id("tinymce");
	public FramePage(WebDriver driver) 
	{
		this.driver=driver;	
	}
	
	//This method will actually switch from DOM to IFrame 
	public void SwitchTo()
	{
	 driver.switchTo().frame(Frame);	
	}	
	public void ClearText()
	{
	 driver.findElement(textarea).clear();	
	}	
	public void Send()
	{
	 driver.findElement(textarea).sendKeys("Hello");	
	}
}	
