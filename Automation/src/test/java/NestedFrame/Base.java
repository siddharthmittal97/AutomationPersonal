package NestedFrame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Base 
{
	private WebDriver driver;
	protected HomeFrames frame;	
	@BeforeClass
    public void BaseContext()
	{
	String projectpath = System.getProperty("user.dir");
	System.out.println("projectpath : "+projectpath);
	System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/");
	frame = new HomeFrames(driver);
	}
    @AfterClass
	public void Tearss()
	{
   //driver.quit();	
	}
}
