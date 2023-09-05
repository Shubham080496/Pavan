package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConditionalMethods {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed()
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of logo:"+logo.isDisplayed());
		
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display stutus of logo:"+status);
		
		//isEnabled()
		boolean enablestatus=driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println("Enable status :"+enablestatus);
		
		//isSelected()
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection....................");
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //false
		
		male_rd.click(); // this will select male radio button
		
		System.out.println("After selecting male radio button..................");
		System.out.println(male_rd.isSelected());  //true
		System.out.println(female_rd.isSelected()); //false
		
		female_rd.click();  // this will select female radio button
		System.out.println("After selecting female radio button..................");
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //true
				
	}
}
