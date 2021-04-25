package JavaScriptScroll;
import org.testng.annotations.Test;
public class MainExecution extends Base
{
@Test
	public void Execution()
	{
		var vr = JS.Click();
		vr.ScrolltoTable();
	}
}
