package day29;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment1_HandleCheckboxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        
		System.out.println("Total no of checkboxes:"+ checkboxes.size()); //size =7
		
		//select all checkboxes using enhanced for loop
		
	/*	for(WebElement check:checkboxes) 
		{
			check.click();
		}
    */  
		
		//select all checkboxes using classic for loop
		
	/*	for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
	*/	
		
		//select last 3 checkboxes
		
    /*    for(int i=4;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        }
    */
        
         //select first 3 checkboxes
		
        for(int i=0;i<3;i++) //int i=2;i<checkboxes.size();i--
        {
        	checkboxes.get(i).click();
        }
		
      //unselect- selected checkboxes using classic for loop
        
        for(int i=0;i<checkboxes.size();i++)
        {
        	if(checkboxes.get(i).isSelected())
        	{
        		checkboxes.get(i).click();
        	}
        }
        
        //unselect- selected checkboxes using enhanced for loop
        
        /*   for(WebElement check:checkboxes) 
       		{
       			if(check.isSelected()) 
       			{
       				check.click();
       			}
       		}
        */	
        
        
	}

}
