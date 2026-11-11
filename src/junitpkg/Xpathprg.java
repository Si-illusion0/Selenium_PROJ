package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprg {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		WebElement username = driver.findElement(By.xpath("//input[@id=\"ulogin\"]"));
		username.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("pass123");
		
		WebElement sbutton = driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
		sbutton.click();
	}

}
