package com.jpet.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jpet.excelutilities.jpet_exceldata;

public class jpet_register_and_addtocart_page {
	WebDriver driver;
	WebElement Register;
public void launchapplication() {
	// To launch Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//To open application homepage
driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
}
	public void register() throws IOException 
	{
		jpet_exceldata ed = new jpet_exceldata();	
		for(int i=1;i<=1;i++)	
		{
		// To click on signin button
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			
		// To click on register now button
			Register = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
			Register.click();
			
		// To get data from Excel	
			
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("repeatedPassword")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("account.firstName")).sendKeys(ed.Firstname(i));
			driver.findElement(By.name("account.lastName")).sendKeys(ed.Lastname(i));
			driver.findElement(By.name("account.email")).sendKeys(ed.Email(i));
			driver.findElement(By.name("account.phone")).sendKeys(ed.Phone(i));
			driver.findElement(By.name("account.address1")).sendKeys(ed.Address1(i));
			driver.findElement(By.name("account.address2")).sendKeys(ed.Address2(i));
			driver.findElement(By.name("account.city")).sendKeys(ed.City(i));
			driver.findElement(By.name("account.state")).sendKeys(ed.State(i));
			driver.findElement(By.name("account.zip")).sendKeys(ed.Zip(i));
			driver.findElement(By.name("account.country")).sendKeys(ed.Country(i));
			driver.findElement(By.name("account.listOption")).click();
			driver.findElement(By.name("account.bannerOption")).click();
			driver.findElement(By.name("newAccount")).click();
			System.out.println("Registration success");
	}
	}
	
	
	public void selectcategory()
	{
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	}
	public void selectproduct() {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	}
	public void addtocart() {
	
		// To proceed add to cart function
			
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	}
		public void takescreenshot1(String path) throws IOException, InterruptedException 
		{
			// To take screenshot for add to cart function
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
