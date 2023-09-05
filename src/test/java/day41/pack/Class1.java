package day41.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	void abc()
	{
		System.out.println("this is abc from Class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("this is before test method...");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite....");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before class method.....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after class method.....");
	}
}
