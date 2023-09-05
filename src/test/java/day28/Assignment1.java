package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

		System.out.println("Total number links in search results:" + searchResults.size());

		// print and click all links

		for (WebElement link : searchResults) 
		{
			System.out.println(link.getText());
			link.click();
		}

		// capture all window IDs

		Set<String> windowIDs = driver.getWindowHandles();

		// Iterate through each window ID using foreach loop
		// switch to window based on ID, get and compare title and perform some action

		for (String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();

			// System.out.println(title); //print all open windows title

			if (title.equals("Selenium - Wikipedia")) {
				System.out.println(driver.getTitle());
			}

			if (title.equals("Selenium (software) - Wikipedia") || title.equals("Selenium dioxide - Wikipedia")) {
				driver.close();
			}

		}
		// driver.quit();
	}

}
