package TestNGPackage;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MultipleWindowPrg {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void test() throws Exception {
		String parentwin = driver.getWindowHandle();
		System.out.println("Title of Google "+ driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		ArrayList<String> windetails = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windetails.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parentwin);
		
		
		
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
