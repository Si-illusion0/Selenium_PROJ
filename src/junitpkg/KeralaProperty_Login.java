package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeralaProperty_Login {
	
	ChromeDriver driver;
	@BeforeEach
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();//to maximize the window
	}
	
	@Test
	public void tverification() {
		String actualtitle = driver.getTitle();
		System.out.println("Title of web application : "+actualtitle);
	}
	
	@Test
	public void testverification() {
		String sourcecode = driver.getPageSource();//to retive the source code information
		if(sourcecode.contains("User Login")) {
			System.out.println("Text is present");
		}else {
			System.out.println("Text is not present");
		}
	}
	
	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("ulogin")); //locating uname with locator id
		username.sendKeys("abcd");//only accept string values
		
		WebElement password = driver.findElement(By.name("upass")); //locating password with locator name
		password.sendKeys("password123");
		
		WebElement loginButton = driver.findElement(By.id("sub_logbtn"));
		loginButton.click();
	}
	
	@AfterEach
	public void closingmthd() {
		driver.quit();
	}


}
