package day41;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		//String title="abc";
		
		/*if(title.equals("xyz"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		*/
		
		//Assert.assertEquals("abc","xyz");
		//Assert.assertEquals(1, 2);
		
		//Assert.assertNotEquals("ABC","XYZ");  //PASS
		//Assert.assertNotEquals("ABC","ABC"); //FAIL
		
		//Assert.assertTrue(true);  //pass
		//Assert.assertTrue(1==2);  //fail
		Assert.assertFalse(1==2);  //PASS
		
		Assert.fail();  // directly faild test method without any condition
		
	}
	
}
