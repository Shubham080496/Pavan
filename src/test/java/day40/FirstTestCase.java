package day40;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	public void openApp() {
		System.out.println("open the applicatipon");
	}
	
	@Test(priority=2)
	public void logIn() {
		System.out.println("log into the applicatipon");
	}
	
	@Test(priority=3)
	public void logOut() {
		System.out.println("log out from the applicatipon");
	}
	
}
