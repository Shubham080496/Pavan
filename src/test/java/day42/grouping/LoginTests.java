package day42.grouping;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity*/


public class LoginTests {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println("this is login by facebook..");
	}
	
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("this is login by twitter..");
	}
}
