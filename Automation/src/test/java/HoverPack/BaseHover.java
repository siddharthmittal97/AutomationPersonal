//Initial Base Class
package HoverPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseHover
{
private WebDriver driver;
protected HomeHovers homepagess;
	@BeforeClass
	public void Base()
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");//webdriver.chrome.driver
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homepagess = new HomeHovers(driver); 
    }
	@AfterClass
	public void Tear()
	{
		driver.quit();
	}
}
