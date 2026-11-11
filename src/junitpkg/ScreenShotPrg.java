package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenShotPrg {
	
	ChromeDriver driver;
	Select obj;
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void screenshot() throws Exception {
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//casting the driver object to the TakesScreenshot interface to take screenshot
		
		FileHandler.copy(s, new File("C:\\Users\\learn\\OneDrive\\Desktop\\Selenium works\\Screenshots\\Rediff.png"));
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		File logosrnshot = logo.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(logosrnshot, new File("C:\\Users\\learn\\OneDrive\\Desktop\\Selenium works\\Screenshots\\logo.png"));
		
		
		
	}


}
