package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\resume.pdf");
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(System.getProperty("user.dir")+"\\testdata\\resume.pdf");

		
//windows- backword slashes
		//mac -fporward slashes in path or location
	}

}
