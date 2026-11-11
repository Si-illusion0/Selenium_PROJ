package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVerification {
	ChromeDriver driver;
	@BeforeEach
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
	}
	@Test
	public void logo() throws Exception {
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"f\"]"));
		//radio.click();
		boolean genderbtn = radio.isEnabled();
		System.out.println("Gender btn is enabled"+genderbtn);
		
		WebElement chkbox = driver.findElement(By.xpath("//input[contains(@name,'chk_altemail')]"));
		//chkbox.click();
		boolean chkverify = chkbox.isSelected();
		if(chkverify == true) {
			System.out.println("Check Box is Selected");
		}else {
			System.out.println("Check Box is not Selected");
			chkbox.click();
			
			Thread.sleep(2000);
		}
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		//logo.click();
		boolean result = logo.isDisplayed();
		if(result == true) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not display");
		}
		

	}

}
