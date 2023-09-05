package day41.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	void xyz()
	{
		System.out.println("this is xyz from Class 2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is after test method...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite....");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This is after class method.....");
	}
}
