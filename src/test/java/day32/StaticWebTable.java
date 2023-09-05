package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//Total no of rows in table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total no of rows in table "+rows);
		
		//Total no of columns
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total no of columns in table "+columns);
		
		//read data from specific row and column
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
		System.out.println(bookname);
		
		//read all data from table
		System.out.println("Book Name"+"\t"+"Autor"+"\t"+"Subject"+"\t"+"Price"); //print headers
		
		for(int r=2;r<=rows;r++) 
		{
			for(int c=1;c<=columns;c++ )
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t"); //\t -- tab space
			}
			  System.out.println();
		}

		//print booknames whose auther is Mukesh
		
		for(int r=2;r<=rows;r++)
		{
			String auther=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(auther.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"  "+auther);

			}
	    }
			//find total price of all books
			
			int total=0;
			for(int ro=2;ro<=rows;ro++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ro+"]/td[4]")).getText();
                total=total+Integer.parseInt(price);
			}
            System.out.println("total price of all books "+total);

		}

}
