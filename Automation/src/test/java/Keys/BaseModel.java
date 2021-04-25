package Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseModel 
{
	private WebDriver driver;
	protected HomeKey Hello;
	@BeforeClass
	public void BaseKey()
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");//webdriver.chrome.driver
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Hello= new HomeKey(driver);
	}
	@AfterClass
	public void Tears()
	{
		driver.quit();
	}
}
