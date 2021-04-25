package FramesHandle;
import org.testng.annotations.Test;
public class TestPage extends Base
{
	@Test
	public void Main()
	{
		var a= fr.clickContext();
		a.SwitchTo();
		a.ClearText();
		a.Send();
	}
}
