package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Testpgm {
	ChromeDriver driver;
	@BeforeEach
	public void browsersetup() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		WebElement buttoon = driver.findElement(By.id("submit"));
		buttoon.click();
		
		
		}
	@AfterEach
	public void closemthd() {
		driver.quit();
	}

}
