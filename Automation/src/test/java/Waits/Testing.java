package Waits;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class Testing extends Base
{
	@Test
	public void TestHello()
	{
		var variable = loading.Click();
	    variable.ElementClick();
	    variable.ButtonClick();
	    System.out.println(variable.GetText());
	    assertEquals(variable.GetText(),"Hello World!","Error");
	}
}
 