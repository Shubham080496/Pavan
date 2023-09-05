package day41;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1) Login --- @BeforeMethod
2) search --- @Test
3) Logout  ---@AfterMethod
4) Login
5) Advanced search  --- @Test
6) Logout
 
*/
public class AnnotationsDemo1 {
	
	@BeforeMethod
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
	

	@AfterMethod
	public void logout()
	{
		System.out.println("This is logout");
		
	}
	
}
