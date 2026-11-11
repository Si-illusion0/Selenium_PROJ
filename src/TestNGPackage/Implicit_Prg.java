package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Implicit_Prg {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	//driver.navigate().refresh();
	}
	@Test
	public void implicit_mthd() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement electro = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		Actions a = new Actions(driver);
		a.moveToElement(electro).perform();
		
		WebElement option = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		option.click();
		
	}

}
