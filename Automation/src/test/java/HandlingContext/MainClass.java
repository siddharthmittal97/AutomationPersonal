package HandlingContext;
import org.testng.annotations.Test;
public class MainClass extends BaseHandle 
{
	@Test
	public void MainTest()
	{
		var varib = homec.clickContext();
		varib.clickingBox();
		varib.GetAlertText();
		System.out.println(varib.GetAlertText());
		varib.AlertOk();
	}
}
