package dropdownpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass 
{
	private WebDriver driver;
	protected Home home;
	
	@BeforeClass
	public void Base()
	{
	String projectpath = System.getProperty("user.dir");
	System.out.println("projectpath : "+projectpath);
	System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	home = new Home(driver);
    }
	
	@AfterClass
	public void Tear()
	{
	driver.quit();	
	}
}
