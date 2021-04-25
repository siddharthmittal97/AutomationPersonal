package Waits;
//import java.time.Duration;
//import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class LoadingPage
{
	private WebDriver driver;
	private By Button = By.xpath("//button[contains(text(),'Start')]");
	private By Loading = By.id("loading"); 
	private By Text = By.xpath("//h4[contains(text(),'Hello World!')]");
	public LoadingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void Click(String linktext)
	{
		driver.findElement(By.linkText(linktext)).click();
	}
	public void ElementClick()
	{
		Click("Example 1: Element on page that is hidden");
	}		
	//@SuppressWarnings("unchecked")
	public void ButtonClick()
	{
		driver.findElement(Button).click();
		
        //Using Explict wait  
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Loading));
		/*
		@SuppressWarnings({ "rawtypes", "unchecked" })
		FluentWait wait = new FluentWait(driver)
	    .withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Loading));*/
	}
	public String GetText()
	{
		return driver.findElement(Text).getText();
	}
}
