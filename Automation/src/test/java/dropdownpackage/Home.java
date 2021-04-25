package dropdownpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Home 
{
private WebDriver driver;
    public Home(WebDriver driver)
	{
		this.driver= driver;
	}
     public Dropdown clickdropdown()
	{
		clickLink("DropDown");
		return new Dropdown(driver);
	}
     private void clickLink(String LinkText)
	{
		driver.findElement(By.linkText(LinkText));
	}
}
