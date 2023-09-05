package day45;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	//constructor
	
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
     //@FindBy(how=How.XPATH, using="//input[@placeholder='Username']") WebElement txt_username;
    @FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	
    @FindBy(name="password") WebElement txt_password;
    
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	//Action merthods
	
	public void setUsername(String usname)
	{
		txt_username.sendKeys(usname);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}

	public void clickLogin()
	{
		btn_login.click();
	}
	
	public int numberOfLinks()
	{
		return links.size();
		
	}
}
