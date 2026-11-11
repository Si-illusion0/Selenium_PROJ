package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeHandlingPrg {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();	
	}
	@Test(priority = 1)
	public void logmthd() {
			WebElement username = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
			username.sendKeys("newacca323@gmail.com");
			WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
			password.sendKeys("sankar@123");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
			login.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.urlContains("myhome"));
	}
	@Test(priority = 2)
	public void addpropetymthd() {
		WebElement addpbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		addpbtn.click();
		
		//summary box comes under iframe so we need to switch to the iframe and pass values to the summary box
		WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frametag);
		
		WebElement sumbox = driver.findElement(By.xpath("/html/body"));
		sumbox.click();
		sumbox.sendKeys("asdfgg");
		
		driver.switchTo().defaultContent();
	}
	

}
