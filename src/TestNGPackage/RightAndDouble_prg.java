package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightAndDouble_prg {
	ChromeDriver driver;
	@BeforeClass
	public void bsetup() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
	@Test
	public void btnclk() throws Exception {
		//Double click
		Thread.sleep(2000);
		WebElement doublebtn = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions a = new Actions(driver);
		a.doubleClick(doublebtn);
		
		//right Click
		Thread.sleep(2000);
		WebElement rightbtn = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		a.contextClick(rightbtn);
		
		a.perform();

		
		
	}

}
