package AlertHandle;
import org.testng.annotations.Test;
public class Exec extends BaseAlerts
{
	@Test
	public void Main()
	{	
	var variable = abc.clickAlert();
	variable.ClickButton();
	variable.PressOk();
	System.out.println(variable.GetResults());
	}
}
