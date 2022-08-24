package com.admin.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.admin.utilities.excelutility;

import junit.framework.Assert;

public class DataDriverTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Admin\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="LoginData")
	public void logitest(String user,String password,String exp)
	{
		System.out.println(user + password +exp);
		driver.get("https://app.hisociety.in/");
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		WebElement txtPass= driver.findElement(By.name("password"));
		txtPass.clear();
		txtPass.sendKeys(password);
		
		driver.findElement(By.xpath("//div/button[contains(text(),\"Signin\")]")).click();
		
		String exp_title="Hi Society";
		String act_title=driver.getTitle();
			
		if(exp.equals("Valid")) {
			if(exp_title.equals(act_title))
			{
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link']")).click();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				//a[@class='dropdown-item']
				driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
				Assert.assertTrue(true);
			}
			else {
				
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid")) {
			if(exp_title.equals(act_title))
			{
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link']")).click();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	
	}
	
	@DataProvider(name="LoginData")
public String [][] getData() throws IOException {
	
		/*	String loginData[][]= {
		{"john.dave@gmail.com","test@1234","valid"},
			{"snehal.nayak@paymentz.com","test@1234","Invalid"}
			}; */
		String path="C:\\Users\\Admin\\eclipse-workspace\\Admin\\src\\test\\java\\com\\admin\\testdata\\dataset.xlsx";
		excelutility xlutil=new excelutility(path);
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String loginData[][] =new String [totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		
	return loginData;
	}

	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
}
