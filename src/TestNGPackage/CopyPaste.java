package TestNGPackage;


import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CopyPaste {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void log() throws Exception {
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		fname.sendKeys("siva");
		
		//To select the values from fname field  (Ctrl+A)
		Actions a = new Actions(driver);
		a.keyDown(fname, Keys.CONTROL).sendKeys("a");
		a.keyUp(Keys.CONTROL);
		
		a.keyDown(fname, Keys.CONTROL).sendKeys("c");
		a.keyUp(Keys.CONTROL);
		
		//To paste the values from fname field to mail id  (Ctrl+A)
		WebElement mail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		a.keyDown(mail, Keys.CONTROL).sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();
		
		Thread.sleep(3000);
		
	}
	@AfterClass
	public void closebroweser() {
		driver.quit();
	}

}
