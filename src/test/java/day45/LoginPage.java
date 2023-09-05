package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//constructor
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.name("password");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action merthods
	
	public void setUsername(String usname)
	{
		driver.findElement(txt_username_loc).sendKeys(usname);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
}
