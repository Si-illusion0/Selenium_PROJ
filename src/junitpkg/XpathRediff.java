package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRediff {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void name() {
		WebElement uname = driver.findElement(By.xpath("//p[@id=\"signin_info\"]/a[1]"));
		uname.click();
		
	}

}
