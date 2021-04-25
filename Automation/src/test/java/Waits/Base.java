package Waits;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import com.google.common.io.Files;
public class Base 
{
	//private EventFiringWebDriver driver;
	private WebDriver driver;
	protected HomeWait loading;	
	@BeforeClass
    public void BaseContext()
	{
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectpath : "+projectpath);
		System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
		//driver = new EventFiringWebDriver ( new ChromeDriver());
		driver = new ChromeDriver();
		//driver.register(new EventsReporter());
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		loading = new HomeWait(driver);
	}
	
    @AfterClass
	public void Tearss()
	{
   //driver.quit();	
	}
    @AfterMethod
    public void recordFailure(ITestResult result)
    {
    	if(ITestResult.SUCCESS==result.getStatus())
    	{
	    	var camera = (TakesScreenshot)driver;
	    	File screenshot = camera.getScreenshotAs(OutputType.FILE);
	    	System.out.println("Screenshot taken" +screenshot.getAbsolutePath());
	    	try {
				Files.move(screenshot, new File("C:\\Users\\user\\Desktop\\Personal Training\\Automation\\src\\main\\java\\resources\\test90.png"));
			} catch (IOException e) {
				e.printStackTrace();
				e.getMessage();
				e.getCause();
			}
    	}   	
    }
}
