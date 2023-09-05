package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* 1]Open application "https://www.demoblaze.com/index.html"
   2]Click on Any product link using linkText /partialLinkText 
   3]Total number of links & print them
   4]Total number of images*/

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/index.html");

		driver.manage().window().maximize();

		// driver.findElement(By.linkText("About us")).click();

		// driver.findElement(By.partialLinkText("Abou")).click();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total number of links:" + links.size());

		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		List<WebElement> images = driver.findElements(By.tagName("img"));

		System.out.println("Total number of images:" + images.size());

	}

}
