package HorizontalSlide;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
public class MainExecution extends BaseSlide 
{
	@Test
	public void MainTest() throws Exception
		{
		String value="4";
		var a = slid.ClickHorizontalSlide();
		a.SetValue(value);
		assertEquals(a.GetSliderValue(), value, "Slider value is incorrect");
		}
}
