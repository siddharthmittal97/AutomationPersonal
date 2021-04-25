package NestedFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FramesPage 
{
	private WebDriver driver;
	private String FrameTop = "frame-top";
	private String Frameleft = "frame-left";
	private String Framemiddle = "frame-middle";
	private String Frameright = "frame-right";
	private String FrameBottom = "frame-bottom";
	private By textfetch = By.cssSelector("body");
	public FramesPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public String getLeftFrameText()
	{
		driver.switchTo().frame(FrameTop);
		driver.switchTo().frame(Frameleft);
		String text = GetText();
		driver.switchTo().parentFrame(); 
		driver.switchTo().parentFrame();
		return text;		
	}
	
	public String getMiddleFrameText()
	{
		driver.switchTo().frame(FrameTop);
		driver.switchTo().frame(Framemiddle);
		String text = GetText();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		return text;		
	}
	
	public String getRightFrameText()
	{
		driver.switchTo().frame(FrameTop);
		driver.switchTo().frame(Frameright);
		String text = GetText();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		return text;		
	}
	public String getBottomFrameText()
	{
		driver.switchTo().frame(FrameBottom);
		String text = GetText();
		driver.switchTo().parentFrame();	
		return text;		
	}
	public String GetText()
	{
		return driver.findElement(textfetch).getText();
	}
}
