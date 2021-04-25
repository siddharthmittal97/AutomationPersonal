package JavaScriptScroll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ScrollPage 
{
	private WebDriver driver;
	private By TableElement = By.id("large-table");
	public ScrollPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void ScrolltoTable()
	{
		WebElement table = driver.findElement(TableElement);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "arguments[0].scrollIntoView()";//Read more about this via DOM W3SCHOOLS
		js.executeScript(script, table);
	}
}
