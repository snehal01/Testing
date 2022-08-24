package hisociety;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class addamenity{
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--start-maximized");
String strWindow = new String();
WebDriver driver = new ChromeDriver(chromeOptions);
driver.get("https://app.hisociety.in/");
WebElement element = driver.findElement(By.name("email"));
element.sendKeys("john.dave@gmail.com");

driver.findElement(By.name("password")).sendKeys("test@1234");
driver.findElement(By.xpath("//button[text()='Signin']")).click();
driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[contains(text(),'Amenity Bookings')]")).click();

driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[contains(.,'Amenity List')]")).click();
driver.findElement(By.xpath("//input[@name='amenityType']")).sendKeys("Podium");
driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
}
}


