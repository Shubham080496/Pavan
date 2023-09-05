package day32;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndTable_Assignment1 {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Boston");
			
		//driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("London");
		
	    WebElement dropdown1=driver.findElement(By.xpath("//select[@name='fromPort']"));
	    
	    Select sc= new Select(dropdown1);
	    
	    sc.selectByVisibleText("Boston");
	    
	    driver.findElement(By.xpath("//select[@name='toPort']")).click(); //without using select class
	    driver.findElement(By.xpath("//option[@value='New York']")).click();
	    
	    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

	    int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
	    
	    System.out.println("Total no of rows=" +rows); //5
	    
		
	  //array declaration
	    String prices[]= new String[rows]; //[0-4]
	 
	  // - capture prices then store in array
	    for(int r=1;r<=rows;r++)
	    {
	    	String ticketprice= driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
			prices[r-1]=ticketprice; //adding price into array

	    }
	    
	  
     //printing all the prices
	    for(String arrvalue:prices)
	    {
			System.out.println(arrvalue);

	    }
	    
	  //- Sort prices then find lower price value
	    
	    Arrays.sort(prices); // this will able to sort strings. so no need to convert to number
	    String lowestPrice =  prices[0];
	    System.out.println("Lowest Price:"+ lowestPrice);
	    
	    for(int r=1;r<=rows;r++)
	    {
	    	String ticketprice= driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
	     
	    	if(ticketprice.equals("lowestPrice"));
	    	{
	    		driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]//input")).click();
	    		break;
	    	}
	    }
	    
	  // - Fill the details then click on Purchase Flight button
		
	  		driver.findElement(By.id("inputName")).sendKeys("Deepak");
	  		driver.findElement(By.id("address")).sendKeys("4572 Saint Marys Avenue");
	  		driver.findElement(By.id("city")).sendKeys("Hamilton");
	  		driver.findElement(By.id("state")).sendKeys("New York");
	  		driver.findElement(By.id("zipCode")).sendKeys("13346");
	  		driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
	  		driver.findElement(By.id("creditCardYear")).clear();
	  		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
	  		driver.findElement(By.id("nameOnCard")).sendKeys("Deepak Reddy");
	  		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();		
	  		
	  	//- validation
	  		String success=driver.findElement(By.xpath("//h1")).getText();
	  		
	  		if(success.equals("Thank you for your purchase today!"))
	  		{
	  			System.out.println("Flight Booking is Successful");
	  			
	  		}
	  		else 
	  		{
	  			System.out.println("Flight Booking is Not Successful");

	  		}
		
	  		driver.quit();
	}

}
