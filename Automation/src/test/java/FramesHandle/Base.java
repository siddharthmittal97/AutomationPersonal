package FramesHandle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Base 
{
	private WebDriver driver;
	protected HomeFrame fr;
	@BeforeClass
    public void BaseContext()
	{
	String projectpath = System.getProperty("user.dir");
	System.out.println("projectpath : "+projectpath);
	System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	fr = new HomeFrame(driver);
	}
    @AfterClass
	public void Tearss()
	{
     driver.quit();	
	}
}
