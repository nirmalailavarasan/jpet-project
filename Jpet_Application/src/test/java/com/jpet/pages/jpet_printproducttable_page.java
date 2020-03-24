package com.jpet.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jpet_printproducttable_page {
	
	WebDriver driver;
public void launchapplication() {
	// To launch Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//To open application homepage
driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
}
	
	public void selectcategorytoprint()
	{
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	}
	public void printproducttable() {
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody")).getText();
					System.out.println(s+" ");
					driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
				}
	public void quit() {
		//close browser
		driver.close();
	}
}