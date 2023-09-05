package day41;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	void test1()
	{
		String title="xyz";
		
		/*if(title.equals("abc"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		//Assert.assertEquals(title,"abc","titles are not matching");
			
		
		if(title.equals("abc"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
}
