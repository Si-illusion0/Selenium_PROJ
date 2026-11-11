package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD_prg {
	ChromeDriver driver;
	Select obj;
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void ddmthd() {
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		//WebElement day = driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		obj = new Select(day);
		obj.selectByIndex(18);
	}
	

}
