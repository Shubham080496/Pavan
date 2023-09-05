package day20;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.WebDriver;

	/*
	1) Launch browser (chrome)
	2) Open URL  https://demo.opencart.com/
	3) Validate title should be   "Your Store"
	4) close page

	 */
	public class FirstTest {

		public static void main(String[] args) {
		
			//1) Launch browser (chrome)
			//ChromeDriver driver=new ChromeDriver();
			WebDriver driver=new ChromeDriver();
			
			
			//EdgeDriver driver=new EdgeDriver();
			//FirefoxDriver driver=new FirefoxDriver();
			//SafariDriver driver=new SafariDriver();
			
			//2) Open URL  https://demo.opencart.com/
			driver.get("https://demo.opencart.com/"); 
			
			//3) Validate title should be   "Your Store"  --- expected
			String act_title=driver.getTitle();
			
			if(act_title.equals("Your Store"))
			{
				System.out.println("Test passed");
						
			}
			else
			{
				System.out.println("Test failed");
			}
			
			//4) close page
			driver.quit();
		}

}
