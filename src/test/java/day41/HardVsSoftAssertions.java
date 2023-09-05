package day41;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	
	//@Test
	void hardAssertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		
		Assert.assertEquals(1, 2);   //fail
		
		System.out.println("hard assertion completed.....");
		
		Assert.assertEquals(1,1);  //pass
				
	}
	
	@Test
	void softAssertions()
	{
		System.out.println("testing....");
		System.out.println("testing....");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1, 2);   //fail
				
		System.out.println("soft assertion completed.....");
		
		sa.assertEquals(1,1);  //pass
		
		sa.assertAll();  // mandatory
				
	}
}
