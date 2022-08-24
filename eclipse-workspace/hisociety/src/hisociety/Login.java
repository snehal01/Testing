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

public class Login{
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

driver.findElement(By.xpath("//button[contains(text(),'Add Notice')]")).click();

driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@name='noticeTitle']")).sendKeys("Meeting");

driver.findElement(By.xpath("(//input[@name='startDate'])[2]")).sendKeys("07-15-2022");

driver.findElement(By.xpath("//input[@name='endDate']")).sendKeys("07-18-2022");

driver.findElement(By.xpath("//textarea[@name='noticeContent']")).sendKeys("Meeting");
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@id='addNoticeFiles']")).sendKeys("C:\\Users\\Admin\\Documents\\Papa\\Notice2.png");

Actions action = new Actions(driver);
WebElement progLanguages = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div/div/span[2]"));
//Get all options in a list
action.click(progLanguages).sendKeys("Meeting").sendKeys(Keys.ENTER).perform();
//WebElement d=driver.findElement(By.xpath("//span[contains(@class,'ant-select-selection-item')][contains(.,'To all')]"));

//Actions action = new Actions(driver);
//action.click(d).sendKeys("To all").sendKeys(Keys.ENTER).perform();
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
WebElement r =driver.findElement(By.xpath("//span[contains(@class,'ant-select-selection-item')][contains(.,'To all')]"));

action.click(r).sendKeys("Selected Flats").sendKeys(Keys.ENTER).perform();

driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
WebElement j=driver.findElement(By.xpath("//span[@class='ant-select-selection-item' and contains(text(),'Select Area Type')]"));
action.click(j).sendKeys("Building").sendKeys(Keys.ENTER).perform();
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
WebElement l=driver.findElement(By.xpath("//span[@class='ant-select-selection-item' and contains(text(),'Select Area Name')] "));
action.click(l).sendKeys("A wing").sendKeys(Keys.ENTER).perform();

driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

WebElement m=driver.findElement(By.xpath("//div[@class='ant-select ant-select-multiple ant-select-show-search' ]"));
action.click(m).sendKeys(Integer.toString(101)).sendKeys(Keys.ENTER).perform();



//driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
//Thread.sleep(500);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[4]/div/div/div/span[2]")).click();
//Thread.sleep(1000);
Thread.sleep(500);
//WebElement prog = driver.findElement(By.xpath("//span[contains(@class,'ant-select-selection-item')][contains(.,'To all')]"));
//Get all options in a list
//List<WebElement> opt = prog.findElements(By.tagName("span"));
//Iterate thorough options
//Thread.sleep(1000);
//for (WebElement option : opt) {
//	if("To all".equals(option.getText()))
//option.click();
//}

//Locate 'Programming Languages' dropdown using id

//Thread.sleep(1000);
//List<WebElement> options = progLanguages.findElements(By.tagName("span"));
//Iterate thorough options
//for (WebElement option : options) {
//	if("Meeting".equals(option.getText()))
//option.click();
//}


//driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
//Thread.sleep(10000);

driver.findElement(By.xpath("//button[contains(text(),'Add Notice') and @class='cust-button btn btn-secondary']")).click();
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);

//div[3]/button



//demo.click();
//driver.navigate().to("https://app.hisociety.in/");
//driver.navigate().back();
//driver.navigate().refresh();
//driver.navigate().forward();
//strWindow = driver.getPageSource();
//System.out.println("Susan:" + "Length :" + strWindow.length());

//driver.quit();
}

private static Object WebDriverWait(WebDriver driver, int i) {
	// TODO Auto-generated method stub
	return null;
}
}

