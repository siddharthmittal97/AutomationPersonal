package HandlingContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseHandle 
{
		private WebDriver driver;
		protected HomeContext homec;	
		@BeforeClass
	    public void BaseContext()
		{
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homec = new HomeContext(driver);
		}
	    @AfterClass
		public void Tearss()
		{
	    driver.quit();	
		}	
     }
