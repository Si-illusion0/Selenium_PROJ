package TestNGPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Windowhandlerprg {
	
	ChromeDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void test() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentwin = driver.getWindowHandle();
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Moblies");
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		icon.click();
		WebElement phn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a"));
		phn.click();
		
		Set<String> tabdetails = driver.getWindowHandles();
		
//		ArrayList<String> windetails = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(windetails.get(1));
		
		for(String handle : tabdetails) {
			if(!handle.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(handle);
				File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(s, new File("C:\\Users\\learn\\OneDrive\\Desktop\\Selenium works\\Screenshots"));
				
				System.out.println("Screenshot saved");
			}
		}
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
