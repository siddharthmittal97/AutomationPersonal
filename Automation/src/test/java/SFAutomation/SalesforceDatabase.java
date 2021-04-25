package SFAutomation;
import org.testng.annotations.DataProvider;
public class SalesforceDatabase 
{	
	@DataProvider(name = "signin-provider")
	public Object [] [] logInData ()
	{
		Object [] [] data = new Object [1] [3];
		data [0] [0] = "siddharth.mittal@mirketa.com";		data [0] [1] = "QWERTY12345";			data [0] [2] = true;	
		return data;
	}
}