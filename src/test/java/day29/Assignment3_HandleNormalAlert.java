package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_HandleNormalAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	//	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.switchTo().alert().accept();

	/*
	  	Alert normalAlert=driver.switchTo().alert();
		System.out.println("Alert text is: "+normalAlert.getText());
		normalAlert.accept();
	*/	
        
        //Handle alert using explicit wait
        
    /*    Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
          System.out.println("Alert text is: "+alert.getText());
		  alert.accept();
    */   
        
	}

}
