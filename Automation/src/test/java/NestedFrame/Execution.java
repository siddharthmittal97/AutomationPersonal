package NestedFrame;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class Execution extends Base
{
	@Test(description="TESTCASE1")
	public void First()
	{
		var TestCase1 = frame.clickFrame();
		frame.NestedFrame();
		System.out.println(TestCase1.getLeftFrameText());
		System.out.println(TestCase1.getMiddleFrameText());
		System.out.println(TestCase1.getRightFrameText());
		System.out.println(TestCase1.getBottomFrameText());
		assertEquals(TestCase1.getLeftFrameText(), "LEFT","Error");
		assertEquals(TestCase1.getMiddleFrameText(), "MIDDLE","Error");
		assertEquals(TestCase1.getRightFrameText(), "RIGHT","Error");
		assertEquals(TestCase1.getBottomFrameText(), "BOTTOM","Error");
	}
}
