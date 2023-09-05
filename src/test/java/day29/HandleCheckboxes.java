package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//capture all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total checkboxes:"+ checkboxes.size());
		
		//select all the check boxes
		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		/*for(int i=0; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//select last 3 checkboxes
		//total no Of checkboxes-how many checkboxes want to select=startig index
		//7-3=4 ( stating index)
		
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		//select first 3 checkboxes
		for(int i=0;i<3;i++) //int i=2;i<checkboxes.size();i--
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		//unselect - select checkboxes
		/*for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}
		*/
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		
	}
}
