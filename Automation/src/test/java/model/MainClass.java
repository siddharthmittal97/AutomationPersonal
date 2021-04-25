package model;
// PLEASE RUN FROM HERE
import org.testng.annotations.Test;
public class MainClass extends BaseSetup 
{
	@Test
	public void testlogin()
	{
		LoginPage loginPage = homepage.clickFormAuthentication();//doubt
		loginPage.SetUsername("tomsmith");
		loginPage.SetPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		secureAreaPage.getAlertText();	
	}
}
