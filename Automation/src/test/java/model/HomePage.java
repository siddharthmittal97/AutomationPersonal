// TEST AUTOMATION UNIVERSITY
// SELENIUM WEBDRIVER WITH JAVA
package model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage 
{
   private WebDriver driver;	
   private By FormLink = By.linkText("Form Authentication");
   public HomePage(WebDriver driver) 
	   {
		this.driver=driver;
	   }
    public LoginPage clickFormAuthentication()
	    {
	    driver.findElement(FormLink).click();
	    return new LoginPage(driver);
	   }   
}
