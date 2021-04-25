package HorizontalSlide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseSlide 
{
	private WebDriver driver;
	protected HomeSlide slid;
	@BeforeClass	
	public void CreateBase()
	  {
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");//webdriver.chrome.driver
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/"); 
		slid = new HomeSlide(driver);  
	  }
	@AfterClass
	public void Tear()
	{
		//driver.quit();
	}
}
