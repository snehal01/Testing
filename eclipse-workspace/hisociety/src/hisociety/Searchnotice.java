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

public class Searchnotice{
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

WebElement a=driver.findElement(By.xpath("//div[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search']"));
Actions action = new Actions(driver);
action.click(a).sendKeys("Meeting").sendKeys(Keys.ENTER).perform();
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
driver.findElement(By.xpath("//input[@name='startDate']")).sendKeys("07-15-2022");
driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
}}
