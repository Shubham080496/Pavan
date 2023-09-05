package day39;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

 public static void main(String[] args) throws InterruptedException,  IOException      {
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G0&p=google+search");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		
		for(int i=0; i<links.size();i++) {
			
			WebElement element = links.get(i);
			
			String url = element.getAttribute("herf");
			try {
			URL link = new URL(url);
		
		
		HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
		httpconn.connect();
		
	
		int recode = httpconn.getResponseCode();
		
		if(httpconn.getResponseCode()>=400) {
			
			System.out.println(url+"brokenlink");
		}else {
			System.out.println(url+"Not brokenlink");
		}
		}
		catch(Exception e) {
			
		}
		}
		
		}
		
		
	}

