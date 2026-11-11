package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Excelutils;

public class Data_Driven_swaglab_prg {
	ChromeDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
	}
	@DataProvider(name = "loginData")
	public Object[][] getData() throws Exception{
		String path = "C:\\Users\\learn\\OneDrive\\Desktop\\login sample.xlsx";
		String sheet = "login";
		return Excelutils.getTestData(path, sheet);
	}
	@Test (dataProvider = "loginData")
	public void loginTest(String uname , String pass) {
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(pass);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
		System.out.println("Executed for ----- "+uname);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	@AfterMethod
	public void bclose() {
		driver.quit();
	}

}
