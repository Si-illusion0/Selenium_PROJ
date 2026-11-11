package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains {
	ChromeDriver driver;
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
				
	}
	@Test
	public void emailrediff() throws Exception {
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		email.sendKeys("abcd123");
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.xpath("//input[contains(@name,'name') and @placeholder=\"Enter your full name\"]"));
		fname.sendKeys("Siva");
		
		
	}
	

}
