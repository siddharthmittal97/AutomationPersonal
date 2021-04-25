package model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseSetup 
{
	private WebDriver driver;
	protected HomePage homepage;
	@BeforeClass
	public void Setup() 
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");//webdriver.chrome.driver
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homepage = new HomePage(driver);
	}
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
}
