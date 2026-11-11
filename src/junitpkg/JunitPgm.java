package junitpkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitPgm {
	
	ChromeDriver driver;

	@BeforeEach
	public void browsersetup() {
		System.out.println("Before each mthd");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titlever() {
		System.out.println("Test mthd1");
		String actualtitle = driver.getTitle();
		String expectedTitle = "Google";
		if(expectedTitle.equals(actualtitle)) {
			System.out.println("Matches");
		}else {
			System.out.println("Not Matches");
		}
	}
	
	@Test
	public void method2() {
		System.out.println("Method 2");
	}
	
	@AfterEach
	public void closingmthd() {
		System.out.println("After each mthd");
		//driver.close();//to close brower tab
		driver.quit();
	}

}
