package day41;
/*
1) Login  --- @BeforeClass
2) search --- @Test
3) Advanced search  --- @Test
4) Logout --- @AfterClass
  
 */

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	
	@BeforeClass
	public void login()
	{
		System.out.println("This is login");
		
	}
	
	@Test(priority=1)

	public void search()
	{
		System.out.println("This is search");
		
	}
	@Test(priority=2)

	public void advancedSearch()
	{
		System.out.println("This is advanced Search");
		
	}
	

	@AfterClass
	public void logout()
	{
		System.out.println("This is logout");
		
	}
	

}
