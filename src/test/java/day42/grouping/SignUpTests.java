package day42.grouping;

import org.testng.annotations.Test;

/*
 * signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression
 */
public class SignUpTests {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void signupbyemail()
	{
		System.out.println("signup by email");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signupBytwitter()
	{
		System.out.println(" this is signup by twitter");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("signup by facebook");
	}
}
