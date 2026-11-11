package junitpkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Prg {
	ChromeDriver driver;
	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void openhome() throws Exception {
		Thread.sleep(2000); //java wait used to wait or hold for a particular time period it is 2 sec (2000 ms)
		WebElement s = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//s.sendKeys("Mobiles");
		
		s.sendKeys("Mobiles",Keys.ENTER); //to press the enter key(Keys.ENTER)
		
		WebElement pay = driver.findElement(By.xpath("//a[@href=\"/gp/sva/dashboard?ref_=nav_cs_apay\"]"));
		pay.click();
		
		WebElement cart = driver.findElement(By.xpath("//a[@href=\"/gp/cart/view.html?ref_=nav_cart\"]"));
		cart.click();
	}

}
