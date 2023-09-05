package day39;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculatorDDT {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver; //typecast
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		int rows=ExcelUtils.getRowCount(filePath,"Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			//1) read row data from excel sheet
			String pric=ExcelUtils.getCellData(filePath, "Sheet1",i,0);
			String rateofinterest=ExcelUtils.getCellData(filePath, "Sheet1",i,1);
			String per1=ExcelUtils.getCellData(filePath, "Sheet1",i,2);
			String per2=ExcelUtils.getCellData(filePath, "Sheet1",i,3);
			String fre=ExcelUtils.getCellData(filePath, "Sheet1",i,4);
			String exp_mvalue=ExcelUtils.getCellData(filePath, "Sheet1",i,5);
					
			
			//2) pass above  data to the applciation
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			
			//calculate button
			WebElement calculatBtn=driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")); 
			js.executeScript("arguments[0].click()",calculatBtn);
			
			
			//3) validation
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("test passed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Passed");
				ExcelUtils.fillGreenColor(filePath,"Sheet1",i,7);

			}
			else
			{
				System.out.println("test failed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Failed");
				ExcelUtils.fillRedColor(filePath,"Sheet1",i,7);
			}
			
			js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//img[@class='PL5']")));
			
			Thread.sleep(3000);
		}

		driver.close();
	}

}
