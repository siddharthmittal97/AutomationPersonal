/*Description
 Use Of Scroll 
 Use of JavaScript Executor
 Clicking on Large and Deep DOM 
 */

package JavaScriptScroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Base 
{
	private WebDriver driver;
	protected HomeJavaScript JS;	
	@BeforeClass
    public void BaseContext()
	{
	String projectpath = System.getProperty("user.dir");
	System.out.println("projectpath : "+projectpath);
	System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/");
	JS = new HomeJavaScript(driver);
	}
    @AfterClass
	public void Tearss()
	{
   //driver.quit();	
	}
}
