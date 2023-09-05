package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*  --------
1) Launch browser (chrome)
2) Open URL  https://demo.nopcommerce.com/
3) Validate title should be   "nopCommerce demo store"
4) close page */

public class Assignment1 {

	public static void main(String[] args) {
		
		//1] Launch browser
		WebDriver driver = new ChromeDriver();
		
		//2]Open URL
		driver.get("https://demo.nopcommerce.com/");
		
		//3]validate title should be "nopCommerce demo store"  --expected
		
		String actual_title=driver.getTitle();
		
		if(actual_title.equals("nopCommerce demo store")) 
		{
			
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//4] close page
		driver.close();

	}

}
