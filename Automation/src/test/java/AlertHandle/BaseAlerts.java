package AlertHandle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseAlerts 
{
	private WebDriver driver;
	protected Second abc;
	@BeforeClass
    public void BaseTest()
	{
	String projectpath = System.getProperty("user.dir");
	System.out.println("projectpath : "+projectpath);
	System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	abc = new Second(driver);
	}
    @AfterClass
	public void Tearrr()
	{
    driver.quit();	
	}
}
