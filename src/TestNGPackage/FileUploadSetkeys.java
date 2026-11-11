package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadSetkeys {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	}
	@Test
	public void fileuplod() {
		WebElement fileup = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		fileup.sendKeys("C:\\Users\\learn\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-10-24 105415.png");

	}

}
