package NestedFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeFrames 
{
	private By ClickLink = By.xpath("//a[contains(text(),'Frames')]");
	private By neststedframe = By.xpath("//a[contains(text(),'Nested Frames')]");
	private WebDriver driver;
	public HomeFrames(WebDriver driver) 
	{
		this.driver=driver;
	}
	public FramesPage clickFrame()
	{
		clickFrameLink();
		return new FramesPage(driver);
	}
	public void clickFrameLink()
	{
		driver.findElement(ClickLink).click();
	}
	public void NestedFrame()
	{
		driver.findElement(neststedframe).click();
	}
}
