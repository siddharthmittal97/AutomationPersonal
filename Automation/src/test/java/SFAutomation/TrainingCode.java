// TEST AUTOMATION UNIVERSITY
// SELENIUM WEBDRIVER WITH JAVA 
package SFAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TrainingCode 
{
     
	// KEEP IT AS PRIVATE
	private WebDriver driver;
     
     @Test ()
     public void TitleVerification ()
     {
	 String projectpath = System.getProperty("user.dir");
	 System.out.println("projectpath : "+projectpath);
	 System.setProperty("webdriver.chrome.driver" , projectpath+"\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver ();
	 driver.manage().window().maximize();	
	 driver.get("https://the-internet.herokuapp.com");	
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getPageSource());
	 System.out.println(driver.getWindowHandle());
	 System.out.println(driver.hashCode());
	 driver.quit();//close the browser + close the entire session 
	 //driver.close();//close the browser + may not close the entire session
	}
}
