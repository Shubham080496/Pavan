package day37;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//capture screenshot of full page
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		FileUtils.copyFile(sourcefile, targetfile);
		*/
		
		//capture screenshot of specific section of the page
		/*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		FileUtils.copyFile(sourcefile, targetfile);
		*/
		
		//capture screenshpt of web element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		FileUtils.copyFile(sourcefile, targetfile);
	}
}
