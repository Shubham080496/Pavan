package day33;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PaginationDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//close window if it appears
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{		
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		//customers main
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		//Customers sub menu
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
		
		//capture number of pages..
		String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		for(int p=1; p<=5;p++)    //for(int p=1; p<=total_pages;p++)
		{
			
			if(total_pages>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				System.out.println(active_page.getText());
				active_page.click();
				Thread.sleep(3000);
				
			}
			
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			for(int r=1;r<=noOfRows;r++)
			{
				String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[5]")).getText();
				System.out.println(customername+"     "+email+"     "+status);
			}						
		}		
	}
}
