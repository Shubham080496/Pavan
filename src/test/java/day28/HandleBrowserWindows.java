package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Appraoch 1 - using List Collection	
		/*List<String> windowList=new ArrayList(windowIDs);
		
		String parentWindowID=windowList.get(0);
		String childWindowID=windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());//OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM
		
	   //switch to parent window
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());//OrangeHRM 		
		*/
		
		
		//Appraoch 2  - using looping statement
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
						
			if(title.contains("OrangeHRM HR Software"))
			{
				System.out.println(driver.getCurrentUrl());		
				System.out.println("this is child window.....");
				// operations
			}
			
			
		}
		

	}
}
