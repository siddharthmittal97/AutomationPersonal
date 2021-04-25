package HorizontalSlide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class SlidePage 
{
	private WebDriver driver;
	protected By SlValue = By.xpath("//span[@id='range']");
	protected By Slide = By.cssSelector(".sliderContainer input");
	public SlidePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void SetValue(String value)
	{
		while(!GetSliderValue().equals(value));
		{
			driver.findElement(Slide).sendKeys(Keys.ARROW_RIGHT);
		}
	}

	/*
	public void ClickSlide()
	{
		WebElement page = driver.findElement(Slide);
		Actions action = new Actions(driver);
		action.moveToElement(page);
		driver.findElement(Slide).sendKeys(Keys.ARROW_RIGHT);
	}
	*/
	public String GetSliderValue()
	{
	return driver.findElement(SlValue).getText();
	}
}
