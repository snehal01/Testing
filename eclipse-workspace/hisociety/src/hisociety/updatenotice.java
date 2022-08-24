package hisociety;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class updatenotice{
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--start-maximized");
String strWindow = new String();
WebDriver driver = new ChromeDriver(chromeOptions);
driver.get("https://app.hisociety.in/");
//WebElement demo = driver.findElement(By.linkText("DEMO SITES"));
WebElement element = driver.findElement(By.name("email"));
element.sendKeys("john.dave@gmail.com");

driver.findElement(By.name("password")).sendKeys("test@1234");
driver.findElement(By.xpath("//button[text()='Signin']")).click();
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
//WebDriverWait w = new WebDriverWait(driver, 3);
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li:nth-child(2) span")));
driver.findElement(By.xpath("//span[contains(text(),' Notice Board')]")).click();

driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

driver.findElement(By.xpath("//table[@class='table']//tr[@id='toggler0']//td[6]//button[contains(text(),'View')]")).click();

//driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//Thread.sleep(500);

//Delete for all
//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']//span[contains(text(),'Delete')]")).click();
driver.findElement(By.xpath("//button[@class='modalCustomButton btn btn-secondary' and contains(text(),'Delete')]")).click();
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

Thread.sleep(500);
driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']//span[contains(text(),'Delete')]")).click();
////button[@class='modalCustomButton btn btn-secondary' and contains(text(),'Delete')]
//input[@name='editnoticeTitle']
//input[@name='editstartDate']
//input[@name='editendDate']
//textarea[@name='editnoticeContent']
//select[@name='editnoticetype']
//span[contains(text(),'Choose File')]

//Select g=new Select(driver.findElement(By.xpath("//select[@name='editnoticetype']")));
//g.selectByVisibleText("Meeting");
//driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
//Selecting Items in a Multiple SELECT elements
		//driver.get("http://jsbin.com/osebed/2");
		//Select fruits = new Select(driver.findElement(By.id("fruits")));
		//fruits.selectByVisibleText("Banana");
		//fruits.selectByIndex(1);
Thread.sleep(500);
driver.findElement(By.xpath("//li[@id='pagebutton2']//button[contains(text(),'2')]")).click();
//li[@id='pagebutton2']//button[contains(text(),'2')]
}}
