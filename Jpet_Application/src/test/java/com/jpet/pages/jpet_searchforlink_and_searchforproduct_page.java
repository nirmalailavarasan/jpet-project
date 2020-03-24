package com.jpet.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jpet_searchforlink_and_searchforproduct_page {
	WebDriver driver;
	List<WebElement> link;
	
	public void launchapplication() {
		// To launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	//To open application homepage
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
	}
	
	public int Checkforlink() {
			// To check for link
				 link = driver.findElements(By.linkText("www.mybatis.org"));
				int a=link.size();
					System.out.println("Checking link Persent :"+link.size());
					return a;
	}
	
	public void type_a_product() {
		driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Angelfish");
	}
	public void search() 
	{
		// To search for products
			driver.findElement(By.name("searchProducts")).click();
	}
		public void takescreenshot6(String path) throws IOException, InterruptedException 
		{
			// To take screenshot for search function
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		}
	
	public void quit() {
		//close browser
		driver.close();
	}
}
