package HoverPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class HoverPage {

	private WebDriver driver;
    protected By FigureBox = By.className("figure");
    protected By FigureDetails = By.className("figcaption");
	 public HoverPage(WebDriver driver) 
	 {
		this.driver=driver;
	 }
	
	 public FigureCaption HoverImage(int Index)
	 {
		WebElement Image = driver.findElements(FigureBox).get(Index-1);
		Actions action = new Actions(driver);
		action.moveToElement(Image).perform();
		return new FigureCaption(Image.findElement(FigureDetails));
	 }
	
	 
    public class FigureCaption
    {
   	private By FigureName = By.tagName("h5");
   	private By Link = By.tagName("a");
   	private WebElement caption; 
	    public FigureCaption(WebElement caption)
	    {
		this.caption=caption;
	    }
	    
		public boolean isDisplayed()
		{
	    return caption.isDisplayed();	 
		}
		public String getText()
		{
		 return caption.findElement(FigureName).getText();
		}
		
		public String getLink()
		{
		return caption.findElement(Link).getAttribute("href");	
		}	
   }

}
