package SFAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
// Dependent on the SalesforceDatabase Class for Data & I am using the dataProvider Annotation
public class Login 
{ 
	    WebDriver driver;	
	    @Test (dataProviderClass = SalesforceDatabase.class, dataProvider = "signin-provider")
		public void signIn (String usename, String password, boolean success) throws Exception  
		{
			String projectpath = System.getProperty("user.dir");
			System.out.println("projectpath : "+projectpath);
			System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com");		
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usename);
			Thread.sleep(3000);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("Login")).click();
			System.out.println("Log In Credentials: " + "\n" +
					"  Email = " + usename + "\n" +
					"  Password = " + password + "\n" +
					"  Successful Log In = " + success + "\n" );
	     }		
}
