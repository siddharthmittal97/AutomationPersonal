package Keys;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class Execution extends BaseModel 
{
	@Test
	public void Main() throws Exception
	{
		var variable= Hello.Click();
		Thread.sleep(10000);
		variable.SendData("h");
		Thread.sleep(10000);
		assertEquals(variable.getResult(),"You entered: H","Not Found");
	}
}
