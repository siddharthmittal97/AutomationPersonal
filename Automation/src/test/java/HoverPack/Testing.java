package HoverPack;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
public class Testing extends BaseHover
{
	@Test	
	  public void Actual()
	  {
		    var hover = homepagess.ClickHover();
		    var Inside = hover.HoverImage(3);
		    System.out.println(Inside.isDisplayed());
		    System.out.println(Inside.getText());
		    System.out.println(Inside.getLink());
		    assertTrue(Inside.isDisplayed(),"Not Displayed");
		    assertEquals(Inside.getText(),"name: user3","Name Not Found");
       }
}
