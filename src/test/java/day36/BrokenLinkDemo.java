package day36;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) link   href="xyz.com"
2) status code >=400
 */

public class BrokenLinkDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());//48
		
		int brokenlinks=0;
		
		for(WebElement linkElement: links)
		{
			String hrefAttValue=linkElement.getAttribute("href");
			if(hrefAttValue==null || hrefAttValue.isEmpty())
			{
				System.out.println("Href attribute value is null or empty. So not possible to check broken link");
				continue;
			}
			
			try
			{
			URL linkUrl=new URL(hrefAttValue);
			HttpURLConnection conn=(HttpURLConnection)linkUrl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefAttValue+"======>Broken link");
				brokenlinks++;
			}
			else
			{
				System.out.println(hrefAttValue+"======>NOT Broken link");
			}
			}catch(Exception e) {
				// exception handled..
			}
		}

		System.out.println("total number of broken link:"+brokenlinks); //42
		
	}
}
